package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

import javax.naming.ldap.SortControl;

public class P11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		Integer[] NArray = new Integer[N];

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		for (int i = 0; i < N; i++) {
			NArray[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		Arrays.sort(NArray);

		Integer[] sumArray = new Integer[NArray.length];
		sumArray[0]=NArray[0];
		int sum;
		sum=sumArray[0];
		for (int i = 1; i < NArray.length; i++) {
			sumArray[i] = sumArray[i-1] + NArray[i];
			sum +=sumArray[i];
		}
		System.out.println(sum);
	}
}
