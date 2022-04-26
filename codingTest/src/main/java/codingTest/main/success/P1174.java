package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P1174 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		int check = 0;

		for (int q = 0; q < N; q++) {
			check = 0;
			String functionString = bufferedReader.readLine();
			char[] functionArray = functionString.toCharArray();

			// System.out.println();
			int ArrayLength = Integer.parseInt(bufferedReader.readLine());
			String inputString = bufferedReader.readLine();
			StringTokenizer st = new StringTokenizer(inputString, "[],");

			Integer[] inputArray = new Integer[ArrayLength];
			Deque<Integer> deque = new ArrayDeque<Integer>();
			for (int i = 0; i < ArrayLength; i++) {
				inputArray[i] = Integer.parseInt(st.nextToken());
				deque.addFirst(inputArray[i]);
			}

			int vector = 0;

			for (int i = 0; i < functionArray.length; i++) {
				if (functionArray[i] == 'R') {
					vector++;
					continue;
				} else if (functionArray[i] == 'D') {
					// 머리에서 가기
					if (vector % 2 != 0) {
						if (deque.peekFirst() == null) {
							System.out.println("error");
							check = 1;
							break;
						} else {
							deque.removeFirst();
							continue;
						}
						// 꼬리에서 가기
					} else {
						if (deque.peekLast() == null) {
							System.out.println("error");
							check = 1;
							break;
						} else {
							// System.out.println("앞에서 제거작업");
							// System.out.println(deque.peekLast());
							deque.removeLast();
							continue;
						}
					}
				}
			}
			if (deque.size() > 0) {
				if (vector % 2 == 0) {
					int H = deque.size();
					System.out.print("[");
					for (int i = 0; i < H - 1; i++) {
						System.out.print(deque.pollLast() + ",");
					}
					System.out.print(deque.pollLast() + "]");
					System.out.println();
				} else {
					int H = deque.size();
					System.out.print("[");
					for (int i = 0; i < H - 1; i++) {
						System.out.print(deque.pollFirst() + ",");
					}
					System.out.print(deque.pollFirst() + "]");
					System.out.println();
				}
			} else if (deque.size() == 0 && check == 1) {
			} else {
				System.out.println("[]");
			}
		}

	}

}
