package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P18352특정거리도시 {

	static ArrayList<Integer>[] arrayList;
	static Boolean[] visitedBooleans;
	static Integer[] depthArray;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		//while(true)
		//{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		Integer NodeCnt = Integer.parseInt(stringTokenizer.nextToken());
		Integer EdgeCnt = Integer.parseInt(stringTokenizer.nextToken());
		Integer K = Integer.parseInt(stringTokenizer.nextToken());
		Integer StartNode = Integer.parseInt(stringTokenizer.nextToken());

		arrayList = new ArrayList[NodeCnt + 1];
		for (int i = 1; i <= NodeCnt; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}
		visitedBooleans = new Boolean[NodeCnt + 1];
		depthArray = new Integer[NodeCnt + 1];
		for (int i = 0; i < EdgeCnt; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			Integer S = Integer.parseInt(stringTokenizer.nextToken());
			Integer E = Integer.parseInt(stringTokenizer.nextToken());
			arrayList[S].add(E);
			arrayList[E].add(S);
		}

		for (int i = 1; i <= NodeCnt; i++) {
			Collections.sort(arrayList[i]);
		}

		// DFS(StartNode);
		BFS(StartNode);

		int check = 0;
		for (int i = 1; i <= NodeCnt; i++) {
			// System.out.println(i+":::::::::"+depthArray[i]);
			// check=0;
			if (depthArray[i] == K) {
				check = i;
				System.out.println(check);
			}
		}
		if (check == 0) {
			System.out.println(-1);
		}
		//}
	}

	public static void DFS(int Node) {
		visitedBooleans[Node] = true;
		count++;
		for (int i : arrayList[Node]) {
			if (visitedBooleans[i] == null) {
				DFS(i);
			}
		}
	}

	static void BFS(int Node) {
		depthArray[Node] = 0; // 출발점은 0으로 초기화
		visitedBooleans[Node] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		// System.out.println(Node + "번 노드::::count"+count);
		while (!queue.isEmpty()) {
			int new_Node = queue.poll();
			count++;
			for (int i : arrayList[new_Node]) {
				if (visitedBooleans[i] == null) {
					depthArray[i] = count;
					visitedBooleans[i] = true;
					queue.add(i);
					//System.out.println(i + "번 노드와의 거리::::count=================="+count);
				}
			}
		}
	}
}
