import CtCILibrary.TreeNode;

public class a_4_5_validate_bst {
	Integer last_printed = null;
	boolean checkBST(TreeNode n) {
		if (n == null) {
			return true;
		}
		
		if (!checkBST(n.left)) {
			return false;
		}
		
		if(last_printed != null && n.data <= last_printed) {
			return false;
		}
		last_printed = n.data;
		
		if (!checkBST(n.right)) {
			return false;
		}
		
		return true;
	}
}
