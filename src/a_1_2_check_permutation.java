
public class a_1_2_check_permutation {

	static boolean permutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int[] count = new int[128];
		
		char[] str1_arr = str1.toCharArray();
		
		for(char letter: str1_arr) {
			count[letter]++;
		}
		
		for(int i = 0; i < str2.length();i++) {
			char val = str2.charAt(i);
			count[val] --;
			if(count[val] < 0) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutation("ancs","cnas"));
		System.out.println(permutation("aabb","bbaa"));
		System.out.println(permutation("aabb","bbac"));
	}

}
