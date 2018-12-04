
public class a_1_6_string_compression {
	//Creating unused strings
	static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count ++;
			if(i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(count);
				count = 0;
			}
		}
		
		return compressed.length() < str.length() ? compressed.toString() : str ;
	}
	
	//No unused strings
	static String compress_no(String str) {
		int finalLength = countCompression(str);
		if (finalLength >= str.length()) return str;
		
		StringBuilder compressed = new StringBuilder(finalLength);
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}
	
	static int countCompression(String str) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aaaabbccccddddd"));
		System.out.println(compress_no("aaaabbccccddddd"));
	}

}
