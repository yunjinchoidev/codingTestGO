package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class P16471 {

	public static void main(String[] args) throws IOException {
		// Scanner scanner = new Scanner(System.in);

		// String A = scanner.nextLine();
		// String B = scanner.nextLine();
		// System.out.println(A);
		// System.out.println(B);

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String A = bufferedReader.readLine();
		String B = bufferedReader.readLine();

		int N = B.length();
		while (A.length() < B.length()) {
			if (B.charAt(B.length() - 1) == 'A') {
				B = B.substring(0, B.length() - 1);
				// System.out.print("A를 지우기::::::" + B);
			}
			if (B.equals(A)) {
				// System.out.println("B와 A가 같네요 끝냅시다");
				break;
			}
			if (B.charAt(B.length() - 1) == 'B') {
				B = B.substring(0, B.length() - 1);
				// System.out.print("B먼저 지우고::::::" + B);
				String reverse = "";
				for (int i = B.length() - 1; i >= 0; i--) {
					reverse = reverse + B.charAt(i);
				}
				// System.out.println(reverse);
				reverse = reverse.substring(0, reverse.length());
				B = reverse;
				// System.out.println(" 뒤집기::::::" + B);
				if (B == A) {
					break;
				}
			}
		}

		if (B.equals(A)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
