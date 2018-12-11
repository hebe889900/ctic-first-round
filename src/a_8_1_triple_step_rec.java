
public class a_8_1_triple_step_rec {
	int countWays(int n) {
		if(n < 0) {
			return 0;
		} else if(n < 1) {
			return 1;
		} else {
			return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
		}
	}
}
