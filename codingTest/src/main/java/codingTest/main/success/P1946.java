package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1946 {

	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis();

		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());

		
		// T 번 만큼 반복해야지?
		for (int i = 0; i < T; i++) {
			int count = 0;
			int N = Integer.parseInt(bufferedReader.readLine());
			Boolean[] checkArray = new Boolean[N];
			int[][] scoreArray = new int[N][2];
			
			// 지원자들 입력 정보 받고..
			for (int j = 0; j < N; j++) {
				StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
				scoreArray[j][0] = Integer.parseInt(stringTokenizer.nextToken());
				scoreArray[j][1] = Integer.parseInt(stringTokenizer.nextToken());
			}

			Arrays.sort(scoreArray, Comparator.comparing(o1 -> o1[0]));
			/*
			 * System.out.println(scoreArray[0][0]); System.out.println(scoreArray[1][0]);
			 * System.out.println(scoreArray[2][0]); System.out.println(scoreArray[3][0]);
			 * System.out.println(scoreArray[4][0]);
			 */
			//등수
			int k=scoreArray[0][1];
			count=1;
			for (int j = 0; j < N; j++) {
				//for (int e = 0; e < j; e++) {
					//j번째가 면접도 떨어지는 경우가 있더라면.....
				
					if (scoreArray[j][1] <k) { // 합격 
						count++;
						k=scoreArray[j][1];
					//}
				}
			}
			
			

			System.out.println(count);
			// System.out.println("========================");
		}

		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime) / 1000; // 두 시간에 차 계산
		// System.out.println("시간차이(m) : " + secDiffTime);

	}

}
