package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class P1041 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(bufferedReader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long[] SArray = new long[6];

		for (int i = 0; i < 6; i++) {
			SArray[i] = Integer.parseInt(stringTokenizer.nextToken());
			// System.out.print(SArray[i]+" ");
		}

		long A = Math.min(SArray[0], SArray[5]);
		long B = Math.min(SArray[1], SArray[4]);
		long C = Math.min(SArray[2], SArray[3]);

		long[] news = {A,B,C};
		Arrays.sort(news);

		long min = news[0];
		long min1 = news[0] + news[1];
		long min2 = news[0] + news[1] + news[2];

		System.out.println(min);
		System.out.println(min1);
		System.out.println(min2);
		
		
		long sum = 0;
		if (N > 1) {
			Arrays.sort(SArray);
			sum += min2 * 4;
			sum += min1 * (8 * N - 12);
			sum += min * (4 * (N - 2) * (N - 1) + (N - 2) * (N - 2));
		} else {
			Arrays.sort(SArray);
			sum = SArray[0] + SArray[1] + SArray[2] + SArray[3] + SArray[4];
		}
		System.out.println(sum);
	}

}
