package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1339 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(bufferedReader.readLine());

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		Integer[] my = new Integer[N];
		Integer[] you = new Integer[N];

		for (int i = 0; i < N; i++) {
			my[i] = Integer.parseInt(stringTokenizer.nextToken());
			// System.out.println(my[i]);
		}
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < N; i++) {
			you[i] = Integer.parseInt(stringTokenizer.nextToken());
			// System.out.println(you[i]);
		}

		Arrays.sort(my);
		Arrays.sort(you);
		int count = 0;
		int count2 = 0;
		int i = 0;
		int j = 0;
		while (true) {
			if (my[i] < you[j]) {
				i++;
				j++;
				count++;
			} else {
				j++;
			}

			if (j == N) {
				break;
			}

		}

		if (count >= (N / 2 + 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
	}

}