package codingTest.main.fail;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286fail {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N =scanner.nextInt();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<N; i++) {
			int A = scanner.nextInt();
			if(A!=0) {
				if(A>0) {
					priorityQueue.add(A);
				}else {
					priorityQueue.add(-A);
				}
			}else {
				Integer W = priorityQueue.poll();
				if(W<0) {
					
				}
				if(W != null) {
					System.out.println(W);
				}else {
					System.out.println(0);
				};
			}
		}
		

	}

}
