package codingTest.main.day0423;

import java.util.Scanner;

public class adsfa {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};

		String[] completion = {"eden", "kiki"};	

		for (int i = 0; i < completion.length; i++) {
			//int count = 0;
			for (int j = 0; j < participant.length; j++) {
				if (participant[j] == completion[i]) {
					//System.out.println(completion[i]);
					participant[j] = null;
					//count++;
					break;
				}
			}
		}

		for (int i = 0; i < participant.length; i++) {
			 if (participant[i] != null) {
				 System.out.println(participant[i]);
			 }
		}

	}

}
