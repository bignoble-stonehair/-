import java.util.Stack;
public class Chapter1_8_v1 {
	static boolean rowcolumn(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0) return false;
		int n = matrix[0].length;
		int m = matrix.length;
		int x = 0;
		int y = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if(matrix[i][j]==0) {
					stack.push(i);
					stack.push(j);
				}
			}
		}
		while (!stack.empty()) {
			y = stack.pop();
			x = stack.pop();
			for(int i = 0;i < n;i++) {
				matrix[i][y] = 0;
			}
			for(int j = 0;j < n;j++) {
				matrix[x][j] = 0;
			}
		}
		return true;
	}
	static void printMatrix(int [][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.printf(" %d",matrix[i][j]);
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] m = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		rowcolumn(m);
		printMatrix(m);
	}

}
