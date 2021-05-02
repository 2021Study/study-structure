package algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void main(String[] args) {
		// �� ���� ���̿� ���� ���� ������ ���� �� �ִ�.
		// �Է����� �־����� ������ ������̴�.
		int[][] adjArray =  {{0,0,0,0,0,0,0,0},
							{0,0,1,1,1,0,0,0},
							{0,1,0,0,0,1,0,0},
							{0,1,0,0,0,0,0,0},
							{0,1,0,0,0,0,0,0},
							{0,0,1,0,0,0,1,1},
							{0,0,0,0,0,1,0,1},
							{0,0,0,0,0,1,1,0}};
		
		int n = adjArray.length-1; // ������ ���� 
		int v = 5; // Ž���� ������ ������ ��ȣ 		

		boolean visited[] = new boolean[n + 1]; // �湮 ���θ� �˻��� �迭 

		System.out.println("BFS - �������");
		bfs_array(v, adjArray, visited);
	}
	
	// BFS - �������
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