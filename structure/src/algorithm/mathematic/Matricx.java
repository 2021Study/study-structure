package algorithm.mathematic; 

public class Matricx {
	
	public static void Matrix_Addition(int[][] a1, int[][] a2){
		int i, j;
		int c[][] = new int[3][2];
		for(i = 0; i < 3; i++){
			for(j = 0; j < 2; j++)
				c[i][j] = a1[i][j] + a2[i][j];
		}
		System.out.println("행렬의 합");
		System.out.println("-------------");
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 2; j++)
				System.out.print(c[i][j] + "\t");
			System.out.println();
		}
		System.out.println("-------------");
	}

	public static void Matrix_Subtraction(int[][] a1, int[][] a2){
		int i, j;
		int c[][] = new int[3][2];
		for(i = 0; i < 3; i++){
			for(j = 0; j < 2; j++)
				c[i][j] = a1[i][j] - a2[i][j];
		}
		System.out.println("행렬의 차");
		System.out.println("-------------");


		for(i = 0; i < 3; i++){
			for(j = 0; j < 2; j++)
				System.out.print(c[i][j] + "\t");
			System.out.println();
		}System.out.println("-------------");
		System.out.println();
	}

	public static void Matrix_Multiflication(int[][] a1, int[][] b){
		int i, j, k;
		int c[][] = new int[3][4];
		for(i = 0; i < 3; i++){
			for(j = 0; j < 4; j++){
				for(k = 0; k < 2; k++){
					c[i][j] += a1[i][k] * b[k][j];
				}
			}
		}
		System.out.println("행렬의 곱");
		System.out.println("---------------------------");
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 4; j++)
				System.out.print(c[i][j] + "\t");
			System.out.println();
		}System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a1 = {{5, 3}, {-2, 4}, {2, 3}};
		int[][] a2 = {{3, 0}, {1, 6}, {2, 2}};
		int[][] b = {{3, 3, -1, 2}, {5, 7, 1, 0}};
		
		Matrix_Addition(a1,a2);
		Matrix_Subtraction(a1,a2);
		Matrix_Multiflication(a1,b);
	}

}
