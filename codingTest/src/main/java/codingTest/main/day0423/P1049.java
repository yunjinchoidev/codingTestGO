package codingTest.main.day0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1049 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int[][] MArray = new int[M][2];

		for (int i = 0; i < M; i++) {
			//System.out.println();
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			MArray[i][0] = Integer.parseInt(stringTokenizer.nextToken());
			MArray[i][1] = Integer.parseInt(stringTokenizer.nextToken());
			//System.out.print(MArray[i][0] + " " + MArray[i][1]);
		}

		Arrays.sort(MArray, Comparator.comparing(o1->o1[0]));
		int c1=MArray[0][0];
		Arrays.sort(MArray, Comparator.comparing(o1->o1[1]));
		int c2=MArray[0][1];
				
		
		if((double)c1/6<c2) {
			// 패키지를 몇개 살건지
			int packageCnt = (int)N/6;
			//남은 개수
			int out = N-(packageCnt*6);
			//System.out.println("남은 개수"+out);
			Arrays.sort(MArray, Comparator.comparing(o1->o1[1]));
			for (int i = 0; i < M; i++) {
			//System.out.println();
			//System.out.print(MArray[i][0] + " " + MArray[i][1]);
			}
			int out2=c1>(MArray[0][1]*out)?MArray[0][1]*out:c1;
			System.out.println(packageCnt*c1+out2);
		}else {
			int out2=c2*N;
			System.out.println(out2);
		}
		
		
		
	}

}
