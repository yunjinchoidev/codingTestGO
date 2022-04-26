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

public class P11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());

		int N =Integer.parseInt(stringTokenizer.nextToken());
		int M =Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer=new StringTokenizer(bufferedReader.readLine());

		Integer[] NArray=new Integer[N];
		
		for(int i=0; i<N; i++) {
			NArray[i] =Integer.parseInt(stringTokenizer.nextToken());
		}
		
		
		Integer[] sumArray=new Integer[N];
		sumArray[0] = NArray[0];
		for(int i=0; i<N-1; i++) {
			sumArray[i+1] = sumArray[i]+NArray[i+1];
		//	System.out.println(sumArray[i]);
		}
		//System.out.println(sumArray[N-1]);
		
		int start=0;
		int end=0;
		for(int i=0; i<M; i++) {
			stringTokenizer=new StringTokenizer(bufferedReader.readLine());
			start =Integer.parseInt(stringTokenizer.nextToken());
			end =Integer.parseInt(stringTokenizer.nextToken());
			//System.out.println(sumArray[end-1]);
			//System.out.println(sumArray[start-1]);
			if(start==1) {
				System.out.println(sumArray[end-1]);
			}else {
				System.out.println(sumArray[end-1]-sumArray[start-2]);				
			}
		}
	}

}
