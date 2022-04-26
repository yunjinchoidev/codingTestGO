package codingTest.main.day0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2667 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		Integer N = Integer.parseInt(stringTokenizer.nextToken());
		Integer targetMoney = Integer.parseInt(stringTokenizer.nextToken());

		Integer[] nArray = new Integer[N];
		Integer[] cntArray = new Integer[N];
		for (int i = 0; i < N; i++) {
			nArray[i] = Integer.parseInt(bufferedReader.readLine());
			//System.out.println(nArray[i]);
		}

		int sumCnt = 0;
		for (int i = N - 1; i >= 0; i--) {
			//cntArray[i] = targetMoney / nArray[i];
			sumCnt += targetMoney / nArray[i];
			targetMoney=targetMoney % nArray[i];
		}
		System.out.println(sumCnt);
	}

}
