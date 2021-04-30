package algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void main(String[] args) {
		// 두 정점 사이에 여러 개의 간선이 있을 수 있다.
		// 입력으로 주어지는 간선은 양방향이다.
		int[][] adjArray =  {{0,0,0,0,0,0,0,0},
							{0,0,1,1,1,0,0,0},
							{0,1,0,0,0,1,0,0},
							{0,1,0,0,0,0,0,0},
							{0,1,0,0,0,0,0,0},
							{0,0,1,0,0,0,1,1},
							{0,0,0,0,0,1,0,1},
							{0,0,0,0,0,1,1,0}};
		
		int n = adjArray.length-1; // 정점의 개수 
		int v = 5; // 탐색을 시작할 정점의 번호 		

		boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열 

		System.out.println("BFS - 인접행렬");
		bfs_array(v, adjArray, visited);
	}
	
	// BFS - 인접행렬
	public static void bfs_array(int v, int[][] adjArray, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		int n = adjArray.length - 1;

		q.add(v);
		visited[v] = true;

		while (!q.isEmpty()) {
			v = q.poll();
			System.out.print(v + " ");

			for (int i = 1; i <= n; i++) {
				if (adjArray[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
}