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

public class P1744 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = bufferedReader.readLine();
		String target = bufferedReader.readLine();
		int count = 0;
		
		for(int i=0; i<inputString.length(); i++) {
			for(int j=0; j<target.length();j++) {
				int k=0;
				if(inputString.charAt(i)!=target.charAt(i)) {
					k=1;
				}
			}
		}

	}

}
