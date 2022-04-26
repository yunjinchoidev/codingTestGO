package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2606 {

	static ArrayList<Integer>[] arrayList;
	static Boolean[] visitedBooleans;
	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer NodeCnt = Integer.parseInt(bufferedReader.readLine());
		Integer EdgeCnt = Integer.parseInt(bufferedReader.readLine());
		arrayList = new ArrayList[NodeCnt + 1];
		for (int i = 1; i <= NodeCnt; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}
		visitedBooleans = new Boolean[NodeCnt + 1];
		for (int i = 0; i < EdgeCnt; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			Integer S = Integer.parseInt(stringTokenizer.nextToken());
			Integer E = Integer.parseInt(stringTokenizer.nextToken());
			arrayList[S].add(E);
			arrayList[E].add(S);
		}

		for (int i = 1; i <= NodeCnt; i++) {
			Collections.sort(arrayList[i]);
		}
		
		DFS(1);
		//visitedBooleans = new Boolean[N + 1];
		//System.out.println();
		//BFS(V);
		System.out.println(count-1);
	}

	public static void DFS(int Node) {
		visitedBooleans[Node] = true;
		//System.out.print(Node + " ");
		//System.out.println();
		count++;
		for (int i : arrayList[Node]) {
			if (visitedBooleans[i] == null) {
				DFS(i);
			}
		}
	}

	static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visitedBooleans[Node] = true;
		System.out.print(Node + " ");
		while (!queue.isEmpty()) {
			int new_Node = queue.poll();
			for (int i : arrayList[new_Node]) {
				if (visitedBooleans[i] == null) {
					visitedBooleans[i] = true;
					queue.add(i);
					System.out.print(i + " ");
				}
			}
		}
	}
}
