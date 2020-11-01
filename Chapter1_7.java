
public class Chapter1_7 {
	static double[][] roundMatrix(double [][] m) {
		double output[][] = new double [m.length][m[0].length];
		double tmp_output[][] = new double [m.length][m[0].length];
		for (int i = 0; i < m[0].length; i++) {
			for(int j = 0; j < m.length; j++) {
				output[i][m[0].length - 1 - j] = m[i][j];
			}
		}
		for (int i = 0; i < output[0].length; i++) {
			for(int j = 0; j < output.length; j++) {
				tmp_output[j][i] = output[i][j];
			}
		}
		return tmp_output;
	}
	static void printMatrix(double [][] m) {
		for (int i = 0; i < m[0].length; i++) {
			for(int j = 0; j < m.length; j++) {
				System.out.printf(" %f",m[i][j]);
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double[][] m = {{0.0, 1.0, 2.0}, {3.0, 4.0, 5.0}, {6.0, 7.0, 8.0}};
		printMatrix(roundMatrix(m));
	}

}
