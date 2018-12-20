
public class a_16_1_number_swapper {
	void swap(int a, int b) {
		a = a - b;
		b = a + b;
		a = b - a;
	}
	
	void swap_bit(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
