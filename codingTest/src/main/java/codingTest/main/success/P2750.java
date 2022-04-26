package codingTest.main.success;

import java.util.Scanner;

public class P2750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if ( A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}

	}
}
