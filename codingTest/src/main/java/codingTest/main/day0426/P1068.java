package codingTest.main.day0426;

import java.util.ArrayList;
import java.util.Scanner;


public class P1068 {
	static ArrayList<Integer> tree[]; // 트리 저장 arrayList
	static boolean[] visited; // 방문 배열
	static int answer=0; // 자식 노드의 수, 이것이 0이면 리프노드다.
	static int deleteNode=0; // 삭제할 노드

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		tree = new ArrayList[N]; // 트리 저장 초기화
		visited = new boolean[N]; // 방문 배열 초기화
		int root=0;
		
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<Integer>(); // 트리 안에 arrayList가 또 들어가는 형식
		}

		for (int i = 0; i < N; i++) {
			int p=scanner.nextInt();
			if(p!=-1) {
				tree[i].add(p);
				tree[p].add(i);
			}else {
				root=i;
			}
		}
		deleteNode = scanner.nextInt();

		if(deleteNode==root) {
			System.out.println(0);
		}else {
			DFS(root);
			System.out.println(answer);//리프노드의 개수
		}

	}

	// DFS 함수 정의
	static void DFS(int number) {
		visited[number] = true;// 방문했으므로 방문처리
		int cNode=0;
		for (int i : tree[number]) { // 노드 안에서 분기되는 자식 노드에 들어가겠다는 것.
			if (!visited[i] && i != deleteNode) {// 방문하지 않는 것들에 대해서
				 cNode++;
				DFS(i); // DFS는 재귀함수적으로 처리되는 것 (고정 패턴)
			}
		}
		if(cNode==0) {
			//그러면 리프노드다.
			answer++;
		}
	}

}
