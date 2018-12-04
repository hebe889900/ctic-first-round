import java.util.ArrayList;
import java.util.LinkedList;

import CtCILibrary.TreeNode;

public class a_4_3_list_of_depth {
	void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) {
			return;
		}
		
		LinkedList<TreeNode> list = null;
		if (lists.size() == level) {
			list = new LinkedList<TreeNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);
	}
	
	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>> ();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}
}
