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

public class P7562 {

	static int[] dx = { 2, 1, -1, -2, 2, 1, -2, -1 };
	static int[] dy = { 1, 3, 2, 1, -1, -2, -1, -2 };
	static ArrayList<Integer>[][] arrayList;
	static Boolean[][] visitedBooleans;
	static Integer[][] depthArray;
	static Integer targetX;
	static Integer targetY;
	static Integer count = 0;
	static Integer I;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// StringTokenizer(bufferedReader.readLine());
		Integer T = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < T; i++) {
			count = 0;
			I = Integer.parseInt(bufferedReader.readLine());
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			Integer nowX = Integer.parseInt(stringTokenizer.nextToken());
			Integer nowY = Integer.parseInt(stringTokenizer.nextToken());
			visitedBooleans = new Boolean[I][I];
			depthArray = new Integer[I][I];
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			targetX = Integer.parseInt(stringTokenizer.nextToken());
			targetY = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println("=====================");
			System.out.println("I::" + I);
			System.out.println("now::" + nowX + ":::" + nowY);
			System.out.println("target::" + targetX + ":::" + targetY);

			BFS(nowX, nowY);
			System.out.println("=====================");
			System.out.println("=====================");
			System.out.println("=====================");
			System.out.println("=====================");
			
			System.out.println(count);
			

		}
	}

	static void BFS(int x, int y) {
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		queue.add(new Integer[] { x, y });
		visitedBooleans[x][y] = true;
		depthArray[x][y]=0;
		if (x == targetX && y == targetY) {
			System.out.println("한방에 같네요");
			return;
		}
		while (!queue.isEmpty()) {
			Integer new_Node[] = queue.poll();
			System.out.println("여럴번번 돕니다.");
			
			for (int i = 0; i < 8; i++) {
				int mx = new_Node[0] + dx[i];
				int my = new_Node[1] + dy[i];
				System.out.println("변경위치 == x:" + mx + ", y:" + my);
				if (mx != targetX && my != targetY && mx > 0 && my > 0 && mx < I && my < I) {
					if (visitedBooleans[mx][my] == null) {
						visitedBooleans[mx][my] = true;
						queue.add(new Integer[] { mx, my });
						depthArray[mx][my]=depthArray[new_Node[0]][new_Node[1]]+1;
					}
				}
				//결과를 찾았다.
				if (x == targetX && y == targetY) {
					depthArray[mx][my]=depthArray[new_Node[0]][new_Node[1]]+1;
					count=depthArray[mx][my];
					System.out.println(depthArray[mx][my]);
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				
				
			}

		}
	}

	class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
