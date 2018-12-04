import java.lang.reflect.Array;
import java.util.ArrayList;

public class First {
	  public static boolean isUnique(String str) {
	    if(str.length() > 128) {
	      return false;// ASCII only has 128 chars
	    }
	    boolean[] charSet = new boolean[128];
	    for(int i = 0; i < str.length(); i++){
	      int var = str.charAt(i);
	      if(charSet[var]) {
	        return false;
	      }
	      charSet[var] = true;
	    }
	    return true;
	  }
	  
	  public static void main(String [ ] args) {
	    System.out.println(isUnique("ancs"));
	  }
	}
