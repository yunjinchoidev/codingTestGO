package codingTest.main.day0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class P11403 {

	static int[] dx = { 2, 1, -1, -2, 2, 1, -2, -1 };
	static int[] dy = { 1, 3, 2, 1, -1, -2, -1, -2 };
	static ArrayList<Integer>[] arrayList;
	static Boolean[] visitedBooleans;
	static Integer[] depthArray;
	static Integer targetX;
	static Integer targetY;
	static Integer count = 0;
	static Integer I;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer(bufferedReader.readLine());
		Integer T = Integer.parseInt(bufferedReader.readLine());
		arrayList = new ArrayList[T + 1];
		for (int i = 1; i <= T; i++) {
			arrayList[i] = new ArrayList<Integer>();
		}

		visitedBooleans = new Boolean[T + 1];
		for (int i = 1; i <= T; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			count = 0;
			for (int j = 1; j <= T; j++) {
				Integer now = Integer.parseInt(stringTokenizer.nextToken());
				if (now == 1) {
					arrayList[i].add(j);
				}

			}
		}

		for (int i = 1; i <= T; i++) {
			BFS(i);
			for (int j = 1; j <= T; j++) {
				if (visitedBooleans[i] == true) {
					System.out.print(1 + " ");
				}
				if (visitedBooleans[i] == false) {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
			for (int k = 1; k <= T; k++) {
				visitedBooleans[i] = false;
			}
		}

	}

	static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visitedBooleans[Node] = true;
		while (!queue.isEmpty()) {
			Integer new_Node = queue.poll();
			for (int i : arrayList[new_Node]) {
				if (visitedBooleans[i] == null) {
					visitedBooleans[i] = true;
					queue.add(i);
				}
			}
		}
	}

}
