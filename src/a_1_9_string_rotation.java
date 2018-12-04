
public class a_1_9_string_rotation {

	static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return isSubString(s1s1, s2);
		}
		return false;
	}
	
	static boolean isSubString(String s1, String s2) {
		return s1.indexOf(s2) != -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isRotation("apple","leapp"));
		System.out.println(isRotation("apple","pleap"));
		System.out.println(isRotation("app","apple"));
	}

}
