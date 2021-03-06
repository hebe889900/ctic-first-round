import java.util.Arrays;

public class a_8_3_magic_index_binary_search {
	int magicFast(int[] array) {
		Arrays.sort(array);
		return magicFast(array, 0, array.length - 1);
	}
	
	int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		
		int mid = (start + end);
		if(array[mid] == mid) {
			return mid;
		} else if(array[mid] > mid) {
			return magicFast(array, start, mid - 1);
		} else {
			return magicFast(array, mid + 1, end);
		}
	}
}
