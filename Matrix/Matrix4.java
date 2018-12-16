package Matrix;
import Util.Matrix;
public class Matrix4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int[][] m = Matrix.toMatrix(v, 3, 4);
		Matrix.print(m);
	}

}
