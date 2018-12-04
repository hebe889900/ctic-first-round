
public class CompressString {
	static String compressBad(String str) {
		String result = "";
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive ++;
			if(i + 1  >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				result += "" + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		return result.length() < str.length() ? result : str;
	}// O(N2) String concentration

	static String compressBadStringBuilder(String str) {
		StringBuilder result = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive ++;
			if(i + 1  >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				result.append(str.charAt(i));
				result.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return result.length() < str.length() ? result.toString() : str;
	}// O(N) String Builder
	
  public static void main(String [ ] args) {
	    System.out.println(compressBad("aaaanns"));
  }	
}
