import CtCILibrary.AssortedMethods;

public class palindromePermutation {
	public static boolean isPP(String str) {	
	    int[] charSet = new int[128];
	    for(int i = 0; i < str.length(); i++){
	      int var = str.charAt(i);
	      charSet[var] ++;
	    }
	    int oddCount = 0;
	    for(int i = 0; i < charSet.length; i++) {
	    	if(charSet[i] % 2 == 1) {
	    		oddCount ++;
	    	}
	    }
	    return oddCount <= 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isPP("tacocat"));
	}
}
