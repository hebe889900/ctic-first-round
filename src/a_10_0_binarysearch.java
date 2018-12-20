
public class a_10_0_binarysearch {
	int binarySearch(int[] a, int x) {
		int low = 0;
		int high = a.length - 1;
		int mid = (low + high) / 2;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(a[mid] == x) {
				return mid;
			} else if (a[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
	
	int binarySearchRecursive(int[] a, int x, int low, int high) {
		if (low > high) {
			return -1;
		}
		
		int mid = (low + high) / 2;
		if (a[mid] < x) {
			return binarySearchRecursive(a, x, mid + 1, high);
		} else if(a[mid] > x) {
			return binarySearchRecursive(a, x, low, mid - 1);
		} else {
			return mid;
		}
	}
}
