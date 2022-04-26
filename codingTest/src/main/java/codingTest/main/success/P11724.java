package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {

	static ArrayList<Integer>[] A;
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int s = Integer.parseInt(stringTokenizer.nextToken());
			int e = Integer.parseInt(stringTokenizer.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		int count = 0;

		// 이제 노드를 돌자
		for (int i = 1; i < N + 1; i++) {
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}

	static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		visited[v] = true;
		for (int i : A[v]) {
			if (visited[i] == false) {
				DFS(i);
			}
		}
	}

}
