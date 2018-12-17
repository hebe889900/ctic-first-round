import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class a_8_2_robot_in_a_grid_dp {
	ArrayList<Point> getPath(boolean[][] maze) {
		if (maze == null || maze.length == 0) {
			return null;
		}
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedpoints = new HashSet<Point> ();
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedpoints)) {
			return path;
		}

		return null;
	}
	
	boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
		if(col < 0 || row < 0 || !maze[row][col]) {
			return false;
		}
		Point p = new Point(row, col);
		if(failedPoints.contains(p)) {
			return false;
		}
		
		boolean isAtOrigin = (row == 0) && (col == 0);
		if(isAtOrigin || getPath(maze, row - 1, col, path, failedPoints) || getPath(maze, row, col - 1, path, failedPoints)) {
			path.add(p);
			return true;
		}
		failedPoints.add(p);
		return false;
		
	}	
}
