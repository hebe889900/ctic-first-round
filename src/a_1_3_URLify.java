import CtCILibrary.AssortedMethods;

public class a_1_3_URLify {
	static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i] == ' ') {
				spaceCount ++;
			}
		}
		
		int index = trueLength + 2 * spaceCount;
		if(str.length > trueLength) str[trueLength] = '\0';
		
		for (int i = trueLength - 1; i >= 0; i--) {
			if(str[i] == ' ') {
				str[index - 1] = '%';
				str[index - 2] = '2';
				str[index - 3] = '0';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index --;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		replaceSpaces(arr, str.length());	
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}	
}
