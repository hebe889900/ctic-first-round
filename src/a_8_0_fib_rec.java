
public class a_8_0_fib_rec {
	int fibonacci (int i) {
		if (i == 0) return 0;
		if (i == 1) return 1;
		return fibonacci(i - 1) + fibonacci(i - 2);
	}
}
