package Matrix;

public class MatrixEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mA = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] mB = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		int[][] mC = new int[mA.length][mB[0].length];

		for(int i = 0; i < mC.length; i++) {
			for(int j = 0; j < mC[i].length; j++) {
				for(int k = 0; k < mA[0].length; k++) {
					mC[i][j] += mA[i][k] + mB[k][j];
				}
			}
		}
		

		
		for(int i = 0; i < mC.length; i++) {
			for(int j = 0; j < mC[i].length; j++) {
				System.out.print(mC[i][j] + " ");
			}
			System.out.println();
		}
		// int [][]mC = Matrix.prod(mA, mB);
	}

}
