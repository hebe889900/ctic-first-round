//没理解

import CtCILibrary.*;
public class RotateMatrix {
	static boolean rotate(int[][] matrix, int n) {
		if(matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length) {
			return false;
		}
		int[][] result = new int[matrix.length][matrix.length];
		
		for(int i = 0; i < matrix.length/2; i++) {
			int first = i;
			int last = matrix.length - 1 - i;
			for(int j = first; j < last; j++) {
				int offset = j - first;
				int top = matrix[first][j];//Save top
				
				//left to top
				matrix[first][j] = matrix[last-offset][first];
				//bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right to bottom;
				matrix[last][last-offset] = matrix[i][last];
				//top to right
				matrix[i][last] = top;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 10);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}	
}
