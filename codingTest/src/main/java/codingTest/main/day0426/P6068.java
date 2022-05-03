package codingTest.main.day0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P6068 {

	static class one {
		int time;
		int dead;

		public one(int time, int dead) {
			this.time = time;
			this.dead = dead;
		}
	}

	static PriorityQueue<one> priorityQueue = new PriorityQueue<P6068.one>(Comparator.comparingInt(j -> j.dead));

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int time = Integer.parseInt(stringTokenizer.nextToken());
			int dead = Integer.parseInt(stringTokenizer.nextToken());
			priorityQueue.add(new one(time, dead));
		}

		int newDEAD = priorityQueue.peek().dead;

		while (!priorityQueue.isEmpty() && newDEAD>=0) {
			one now = priorityQueue.poll();
			System.out.println(now.time+"::"+now.dead);
			if (now.dead < newDEAD) {
				newDEAD = now.dead - now.time;
			} else {
				newDEAD -= now.dead;
			}
		}

		if (newDEAD > 0) {
			System.out.println(newDEAD);
		} else {
			System.out.println(-1);
		}

	}

}