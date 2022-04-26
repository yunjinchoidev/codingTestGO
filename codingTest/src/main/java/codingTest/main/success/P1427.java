package codingTest.main.success;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntPredicate;

import javax.naming.ldap.SortControl;

public class P1427 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		char[] NArry = N.toCharArray();

		Integer[] A = new Integer[NArry.length];

		for (int i = 0; i < A.length; i++) {
			A[i] = NArry[i] - '0';
		}

        
		Arrays.sort(A, Collections.reverseOrder());
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}

	}
}
