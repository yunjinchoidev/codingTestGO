package codingTest.main.day0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		int[] NArray = new int[N];

		for (int i = 0; i < N; i++) {
			NArray[i] = Integer.parseInt(bufferedReader.readLine());
		}

		Arrays.sort(NArray);
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				sum += NArray[0] * (N - 1);
			} else {
				sum += NArray[i] * (N - i);
			}
		}
		
		System.out.println(sum);

	}

}
