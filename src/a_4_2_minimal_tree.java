import CtCILibrary.TreeNode;

public class a_4_2_minimal_tree {
	TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	TreeNode createMinimalBST(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = createMinimalBST(arr, start, mid - 1);
		root.right = createMinimalBST(arr, mid + 1, end);
		return root;
	}
}
