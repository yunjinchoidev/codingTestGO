package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;

public class P1107 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String StringN = bufferedReader.readLine();
		int N = Integer.parseInt(StringN);
		
		int B = Integer.parseInt(bufferedReader.readLine());
		Boolean[] BrokenArray = new Boolean[10];
		for (int i = 0; i < 10; i++) {
			BrokenArray[i] = true;
		}

		if (B != 0) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int i = 0; i < B; i++) {
				int C = Integer.parseInt(stringTokenizer.nextToken());
				BrokenArray[C] = false;
			}
		}else {
			BrokenArray[0] = true;
		}

		
		
		int min = Math.abs(500000); // 최소값 초기화
		int thenum = 0;
		int solution;
		int result2 = 0;
		int result = 0;
		for (int i = 0; i < 1000000; i++) {
			int check=0;
			String iString = Integer.toString(i);
			char[] iChar = iString.toCharArray();

			for (int j = 0; j < iChar.length; j++) {
				if (BrokenArray[iChar[j] - '0'] == false) {
					check = 1;
					break;
				}
			}

			// 고장난 버튼이 있으므로 사용할 수 없다. 그 채널로 갈 수 가 없다는 소리.
			if (check == 1) {
				continue;
			}

			
			
			if (Math.abs(N - i) < min) {
				// System.out.println(min);
				min = Math.abs(N - i);
				thenum = i;
				//System.out.println(min+"::::::"+check2+":::::"+i);
			}

		}
		
		//100에서 직접 채널로 걸어가기
		result = Math.abs(N - 100); 
		result2=Integer.toString(thenum).length() + min;
		if (result2 > result) {
			solution = result;
			System.out.println(solution);
		} else {
			solution = result2;
			System.out.println(solution);
		}


	}

}
