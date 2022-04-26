package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class P16953 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());
		// System.out.println(A);
		// System.out.println(B);
		int count = 1;
		while (A != B) {
			if (B < A) {
				count=-1;
				break;
			}
			
			if (B % 2 == 0) {
				B = B / 2;
				count++;
				continue;
			} else if (B % 10 == 1) {
				B = (B - 1) / 10;
				count++;
				continue;
			}else {
				count=-1;
				break;
			}
		}
		System.out.println(count);
	}

}
