
public class a_10_9_sorted_matrix_search_naive {
	boolean findElement(int[][] matrix, int elem) {
		int row = 0;
		int column = matrix.length - 1;
		while(row < matrix.length && column >= 0) {
			if(matrix[row][column] == elem) {
				return true;
			} else if(matrix[row][column] > elem) {
				column --;
			} else {
				row ++;
			}
		}
		return false;
	}
	
}
