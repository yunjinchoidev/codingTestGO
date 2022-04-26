package codingTest.main.day0426;

import java.util.ArrayList;
import java.util.Scanner;

public class P11752 {
	static int N;
	static boolean[] visited; // 방문 배열
	static ArrayList<Integer> tree[]; // 트리 저장 arrayList
	static int answer[]; // 부모 노드 저장 배열

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();

		visited = new boolean[N + 1]; // 방문 배열 초기화
		tree = new ArrayList[N + 1]; // 트리 저장 초기화
		answer = new int[N + 1]; // 부모 노드 저장 배열

		for (int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<Integer>(); // 트리 안에 arrayList가 또 들어가는 형식
		}

		for (int i = 1; i < N; i++) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			tree[n1].add(n2);
			tree[n2].add(n1);
		}
		DFS(1); // 부모노드 1 에서 시작
		for(int i=2; i<=N; i++) {
			System.out.println(answer[i]); // 부모 노드 출력 // 1은 제외 (최상위)
		}

	}

	// DFS 함수 정의
	static void DFS(int number) {
		visited[number] = true;// 방문했으므로 방문처리
		for (int i : tree[number]) { // 노드 안에서 분기되는 자식 노드에 들어가겠다는 것.
			if (!visited[i]) {// 방문하지 않는 것들에 대해서
				answer[i] = number; // 자식 노드들의 부모 배열 함수에 number 값을 넣어주면 부모 값을 저장할 수 있게 됨.
				DFS(i); // DFS는 재귀함수적으로 처리되는 것 (고정 패턴)
			}

		}
	}

}
