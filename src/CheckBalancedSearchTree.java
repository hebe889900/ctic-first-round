import CtCILibrary.TreeNode;
public class CheckBalancedSearchTree {
	public static Integer last_printed = null;
	public static boolean checkBST(TreeNode n) {
		if (n == null) {
			return true;
		}
		
		if (!checkBST(n.left)) {
			return false;
		}
		
		System.out.println("n: " + n.data);
		System.out.println("last: " + last_printed);
		if (last_printed != null && n.data <= last_printed) {
			return false;
		}
		last_printed = n.data;
		
		if (!checkBST(n.right)) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] array = {Integer.MIN_VALUE, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
		TreeNode node = TreeNode.createMinimalBST(array);
		//node.left.data = 5;
		//node.left.right.data = 3;
		System.out.println(checkBST(node));
	}
	
    /*           2147483645
    -2147483648                  2147483646
                         2147483647
    */
}
