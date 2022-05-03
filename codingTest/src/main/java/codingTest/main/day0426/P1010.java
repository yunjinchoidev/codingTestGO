package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1010 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int N = Integer.parseInt(stringTokenizer.nextToken());
			int M = Integer.parseInt(stringTokenizer.nextToken());
			int[][] Combination = new int[N+1][M+1];

			Combination[0][0] = 1;
			Combination[N][0] = 1;
			Combination[N][N] = 1;

			for (int k = 2; k <= N; k++) {
				for (int j = 0; j < i; j++) {
					Combination[k][j] = Combination[k-1][j]+Combination[k-1][j-1];
				}
			}
			System.out.println(Combination[N][M]);

		}

	}

}