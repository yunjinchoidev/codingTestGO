package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;

public class P1074 {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		int C = Integer.parseInt(stringTokenizer.nextToken());
		 System.out.println(A);
		 System.out.println(B);
		 System.out.println(C);
        A = (int)Math.pow(2, A);
		sum(A, B, C);
		System.out.println(count);

	}

	static void sum(int N, int r, int c) {
		//System.out.println(N+" "+r+" "+c+"count:::"+count);
		int M = N / 2;

		if (N == 0) {
			return;
		}

		if (r < M && c < M) {
			sum(M, r, c);
		} else if (M <= r && c < M) {
			count += (M * M) * 2;
			sum(M, r - M, c);
		} else if (M <= c && r < M) {
			count += (M * M) * 1;
			sum(M, r, c - M);
		} else {
			count += (M * M) * 3;
			sum(M, r - M, c - M);
		}

	}

}
