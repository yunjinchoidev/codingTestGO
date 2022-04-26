package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

import javax.naming.ldap.SortControl;

public class P11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		String M = bufferedReader.readLine();
		
		char[] Marry = M.toCharArray();
		Integer[] MArray2 =new Integer[N];
		Integer sum=0;
		for(int i=0; i<N; i++) {
			MArray2[i]=Marry[i]-'0';
			sum+=MArray2[i];
		}
		System.out.println(sum);
		

	}

}
