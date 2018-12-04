import CtCILibrary.TreeNode;

public class a_4_4_check_balanced {
	int getHeight(TreeNode root) {
		if (root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	boolean isBalance(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
		if (heightDiff > 1) {
			return false;
		} else {
			return isBalance(root.left) && isBalance(root.right);
		}
	}
	
	
}
