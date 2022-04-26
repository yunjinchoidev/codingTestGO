package codingTest.main.day0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;
import java.util.function.IntPredicate;

public class P1012 {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String aString = bufferedReader.readLine();
		int N = Integer.parseInt(aString.split(" ")[0]);
		int M = Integer.parseInt(aString.split(" ")[1]);

		int[][] matrix1 = new int[N][M];
		int[][] matrix2 = new int[N][M];

		for (int j = 0; j < N; j++) {
			String rowString = bufferedReader.readLine();
			char[] rowStringArray = rowString.toCharArray();
			for (int k = 0; k < M; k++) {
				matrix1[j][k] = rowStringArray[k] - '0';
			}
		}
		for (int j = 0; j < N; j++) {
			String rowString = bufferedReader.readLine();
			char[] rowStringArray = rowString.toCharArray();
			for (int k = 0; k < M; k++) {
				matrix2[j][k] = rowStringArray[k] - '0';
			}
		}

		for (int j = 0; j < N - 3; j++) {
			for (int k = 0; k < M - 3; k++) {
				if (matrix1[0][0] != matrix2[0][0]) {
					count++;
					for (int q = 0; q < 3; q++) {
						for (int w = 0; w < 3; w++) {
							matrix1[j + q][k + w] = matrix1[j + q][k + w] == 0 ? 1 : 0;
						}
					}
				}
			}
		}
		int check = 0;

		for (int j = 0; j < N; j++) {
			for (int k = 0; k < M; k++) {
				if (matrix1[j][k] != matrix2[j][k]) {
					check = 1;
				}
			}
		}
		if (check == 0) {
			System.out.println(count);
		} else {
			System.out.println(-1);
		}

	}

}
