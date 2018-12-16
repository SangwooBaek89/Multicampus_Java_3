package Util;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int [][] m = toMatrix(v, 3, 4);
		print(m);
	}
	
	public static int[][] prod(int mA[][], int mB[][]){
		/*
		 * 1. 구하려는 mC 초기화 필요
		 * 2. mC의 값을 대입하기 위해 한 번씩 방문 필요(2중 for문)
		 * 3. mA와 mB를 이용한 mC값 구하기(for문)
		 * 
		 */
		int mC[][] = new int[mA.length][mB[0].length];
		
		for(int i = 0; i < mC.length; i++) {
			for(int j = 0; j < mC[0].length; j++) {
				for(int k = 0; k < mA[0].length; k ++) {
					mC[i][j] += mA[i][k] + mB[k][j];
				}
			}
		}
		
		return mC;
	}

	//vector -> matrix로
	public static int[][] toMatrix(int[] u, int r, int c) {
		int[][] m = new int[r][c];
		
		for(int i = 0; i < u.length; i++) {
			int y = i % c;
			int x = i / c;
			//System.out.println(x + ", " + y);
			m[x][y] = u[i];
		}
		
		return m;
	}

	public static void print(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
