package codingTest.main.day0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1543 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		int[] NArray = new int[N];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) {
			NArray[i] = Integer.parseInt(bufferedReader.readLine());
			// priorityQueue.add(Integer.parseInt(bufferedReader.readLine()));
		}

		Arrays.sort(NArray);
		for (int i = 0; i < N; i++) {
			deque.add(NArray[i]);
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {
			int A=0;
			int B=0;
			if (deque.peekLast() != null) {
				if (deque.peekFirst() < 0) {
					A = deque.pollFirst();
				}
				if (deque.peekFirst() < 0) {
					B = deque.pollFirst();
				}
				sum += (A * B);
			}
		}
		System.out.println();

		for (int i = 0; i <= N; i++) {
			if (deque.peekLast() != null) {
				if (deque.getLast() > 0) {
					System.out.print(deque.pollLast());
				}
			}
		}

	}

}
