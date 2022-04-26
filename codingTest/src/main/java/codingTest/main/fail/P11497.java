package codingTest.main.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

import javax.naming.ldap.SortControl;

public class P11497 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		//System.out.println(N);
		int[] NArry =new int[N];
		for (int p = 0; p < N; p++) {
			int M = Integer.parseInt(bufferedReader.readLine());
			Integer[] MArray = new Integer[M];

			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int i = 0; i < M; i++) {
				MArray[i] = Integer.parseInt(stringTokenizer.nextToken());
			}

			Arrays.sort(MArray);
			// System.out.println("정렬된 배열=============================");
			for (int i = 0; i < M; i++) {
				//System.out.print(MArray[i] + " ");
			}
			// System.out.println();
			// System.out.println("절댓값..=============================");
			int[] absArry = new int[M];
			for (int i = 0; i < M - 1; i++) {
				absArry[i] = Math.abs(MArray[i + 1] - MArray[i]);
			//	System.out.print(absArry[i] + " ");
			}
			absArry[M - 1] = Math.abs(MArray[M - 1] - MArray[0]);
			// System.out.print(absArry[M-1]+" ");
			// System.out.println();
			// System.out.println("=============================");
			int level = absArry[M - 1];
			int k = level;
			for (int i = M - 2; i >= 1; i--) {
				int max = MArray[M - 1];
				int minus = max - MArray[i];
				int minus2 = max - MArray[i - 1];
				int deter = minus > minus2 ? minus : minus2;
				// System.out.println("max"+max+"mius"+minus+" "+minus2+"deter::::
				// "+deter+"level::; "+level);
				k = k > deter ? deter : k;
			}
			// System.out.println("=============================");
			NArry[p]=k;
			System.out.println(k);
				
		}
		for(int i=0; i<N; i++) {
			
		}
	}

}
