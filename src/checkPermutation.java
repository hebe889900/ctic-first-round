
public class checkPermutation {
	String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	boolean permutation(String s, String r) {
		if(s.length() == r.length()) {
			return false;
		}
		return sort(s).equals(sort(r));//Use the string.equals(Object other) function to compare strings, not the == operator.The function checks the actual contents of the string, the == operator checks whether the references to the objects are equal.
	}
	
	  public void main(String [ ] args) {
		    System.out.println(permutation("ancs","cnas"));
		  }	
}
