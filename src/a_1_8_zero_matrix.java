import java.util.concurrent.ThreadLocalRandom;

public class a_1_8_zero_matrix {
	
	
	//Space O MN
	static void setZero(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row.length; i++) {
			if(row[i]) {
				nullifyRow(matrix, i);				
			}
		}
		
		for(int i = 0; i < col.length; i++) {
			if(col[i]) {
				nullifyColumn(matrix, i);				
			}
		}		
	}
	
	//Space O 1
	static void setZero_1(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}
		
		for (int j = 1; j < matrix.length; j++) {
			if (matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}
		
		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}
		
		if (colHasZero) {
			nullifyColumn(matrix, 0);
		}
	}
	
	static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[i].length; j ++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];		
		for (int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[i].length; j ++) {
				matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 9);
			}
		}	
		
		printMatrix(matrix);
		setZero_1(matrix);
		printMatrix(matrix);	
	}
}
