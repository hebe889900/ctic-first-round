import java.util.ArrayList;

public class a_8_12_eight_queens {
	
	static final int GRID_SIZE = 5;
	
	public static void main(String[] args) {
		Integer[] columns = new Integer[8];
		ArrayList<Integer[]> results = new ArrayList<Integer[]>();
		placeQueens(0, columns, results);
	}
	
	static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
		if (row == GRID_SIZE) {
			results.add(columns.clone());
		} else {
			for (int col = 0; col < GRID_SIZE; col ++) {
				print2DArray(results);
				if(checkValid(columns, row, col)) {
					columns[row] = col;
					placeQueens(row + 1, columns, results);
				}
			}
		}
	}
	
	static boolean checkValid(Integer[] columns, int row1, int column1) {
		for (int row2 = 0; row2 < row1; row2 ++) {
			int column2 = columns[row2];
			if(column1 == column2) {
				return false;
			}
			int columnDistance = Math.abs(column2 - column1);
			int rowDistance = row1 - row2;
			if (columnDistance == rowDistance) {
				return false;
			}
		}
		return true;
	}
	
	static void print2DArray(ArrayList<Integer[]> arr) {
		for(int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).length; j++) {
				System.out.print(arr.get(i)[j] + ", ");
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - - - - - -");
	}
}
