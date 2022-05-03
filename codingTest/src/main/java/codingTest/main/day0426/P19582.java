package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P19582 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(bufferedReader.readLine());


		Integer[][] my = new Integer[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

			my[i][0] = Integer.parseInt(stringTokenizer.nextToken());
			my[i][1] = Integer.parseInt(stringTokenizer.nextToken());
		}

		int sum = 0;
		int count = 0;
		int G = 0;
		for (int i = 0; i < N; i++) {
			if (sum > my[i][0]) {
				count++;
				if(count==2) {
					G=-4;//실패;
					break;
				}
				//System.out.println("넘었네요 i::"+i+"sum:"+sum+"G:"+G);
				sum-=my[i-1][1];
				continue;
			}
			sum+=my[i][1];
			G++;
			//System.out.println("sum:"+sum+"G:"+G);
		}
		
		if (G == N - 1) {
			System.out.println("Kkeo-eok");
		}
		if (G != N - 1) {
			System.out.println("Zzz");
		}

	}

}