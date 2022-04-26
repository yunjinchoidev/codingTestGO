package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class P1260 {

	static ArrayList<Integer>[] arrayList;
	static Boolean[] visitedBooleans;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		Integer N = Integer.parseInt(stringTokenizer.nextToken());
		Integer M = Integer.parseInt(stringTokenizer.nextToken());
		Integer V = Integer.parseInt(stringTokenizer.nextToken());
		arrayList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}
		visitedBooleans = new Boolean[N+1];

		for (int i = 0; i < M; i++) {
			 stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			Integer S = Integer.parseInt(stringTokenizer.nextToken());
			Integer E = Integer.parseInt(stringTokenizer.nextToken());
			arrayList[S].add(E);
			arrayList[E].add(S);
		}
		
		for(int i=1; i<=N; i++) {
			Collections.sort(arrayList[i]);
		}

		DFS(V);
		visitedBooleans = new Boolean[N+1];
		System.out.println();
		BFS(V);
	}

	public static void DFS(int Node) {
		visitedBooleans[Node] = true;
		System.out.print(Node + " ");
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
					System.out.print(i+" ");
				}
			}
		}
	}
}
