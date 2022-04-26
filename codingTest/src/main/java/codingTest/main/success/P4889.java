package codingTest.main.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4889 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		int check=0;
		int solution=0;
		while (!input.contains("-")) {
			solution=0;
			check++;
			//System.out.println(input);
			Stack<Character> stack = new Stack<Character>();

			char[] inputArray = input.toCharArray();
			int count=0;
			for (int i = 0; i < input.length(); i++) {
				//System.out.println(inputArray[i]);

				if (inputArray[i] == '{') {
						stack.push('{');
				}else if (inputArray[i] == '}'){
					if(stack.isEmpty()!=true) {
						if(stack.peek()=='{') {
							stack.pop();
						}else {
							stack.pop();
							count++;
						}
					}else {
						stack.push('{');
						count++;
					}
				}
			}
			solution=count+(int)(stack.size()/2);
			System.out.println(check+". "+solution);
			input = bufferedReader.readLine();
		}

	}

}
