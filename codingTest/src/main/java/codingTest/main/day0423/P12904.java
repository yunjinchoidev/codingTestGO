package codingTest.main.day0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class P12904 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(bufferedReader.readLine());
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long[] SArray = new long[6];

		for (int i = 0; i < 6; i++) {
			SArray[i] = Integer.parseInt(stringTokenizer.nextToken());
			//System.out.print(SArray[i]+" ");
		}
		
		Arrays.sort(SArray);
		long sum=0;
		if(N>2) {
		sum += SArray[0]*N*((4*N)-4);
		sum += SArray[1]*N*4;
		sum += SArray[2]*4+SArray[1]*(N-2)*4+SArray[0]*(N-2)*(N-2);
		}else if(N==2){
			sum += SArray[0]*4;
			sum += SArray[1]*4;
			sum += SArray[2]*4;
		}else {
			sum =  SArray[0]*4+SArray[1];
		}
		System.out.println(sum);
	}

}
