package codingTest.main.success;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		int A =scanner.nextInt();
		
		int[] AArry = new int[2*A];
		Queue<Integer> queue =new LinkedList<Integer>();
		Stack<Integer> stack =new Stack<Integer>();
		
		for(int i=0; i<A; i++) {
			queue.add(i+1);
		};
		
		while(queue.size()!=1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());
		
	}

}
