
public class a_8_5_recursive_multiple_top_down_improve_odd {
	
	int minProduct(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;
		return minProductHelper(smaller, bigger);		
	}
	
	int minProductHelper(int smaller, int bigger) {
		if (smaller == 0) {
			return 0;
		}
		else if (smaller == 1) {
			return bigger;
		}
		
		int s = smaller >> 1;
		int halfProd = minProductHelper(s, bigger);
		
		if (smaller % 2 == 0) {
			return halfProd + halfProd;
		} else {
			return halfProd + halfProd + bigger;
		}
	}
	
	

}


