
public class a_1_4_is_permutation_of_palindrome {
	static boolean isPermutationofPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		//System.out.println(table.length);
		for(char c: phrase.toCharArray()) {		
			int x = Character.getNumericValue(c);
			if( x != -1) {
				table[x]++;
				if(table[x] % 2 == 1) {
					countOdd ++;
				} else {
					countOdd --;
				}				
			}

		}
		return countOdd <= 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutationofPalindrome("abcddcba"));
		System.out.println(isPermutationofPalindrome("abcdedcba"));
		System.out.println(isPermutationofPalindrome("aabc"));
	}	
}
