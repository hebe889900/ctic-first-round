
public class a_8_11_coins_dp {
	public static void main(String args[]) {
		System.out.println(makeChange(20));
	}
	
	
	static int makeChange(int n) {
		int[] denoms = {25, 10, 5, 1};
		int[][] map = new int[n + 1][denoms.length];
		return makeChange(n, denoms, 0, map);
	}
	
	static int makeChange(int amount, int[] denoms, int index, int[][] map) {
		if(map[amount][index] > 0) {
			return map[amount][index];
		}
		
		if(index >= denoms.length - 1) {
			return 1;
		}
		int denomAmount = denoms[index];
		int ways = 0;
		for (int i = 0; i * denomAmount <= amount; i++) {
			int amountRemaining = amount - i * denomAmount;
			print2DArray(map);
			ways += makeChange(amountRemaining, denoms, index + 1, map);
		}
		map[amount][index] = ways;
		return ways;
	}
	
	static void print2DArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - - - - - -");
	}
}
