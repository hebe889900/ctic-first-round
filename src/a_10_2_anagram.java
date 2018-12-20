import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import CtCILibrary.HashMapList;

public class a_10_2_anagram implements Comparator<String> {
	void sort(String[] array) {
		HashMapList<String, String> maplist = new HashMapList<String, String>();
		
		for(String s: array) {
			String key = sortChars(s);
			maplist.put(key, s);
		}
		
		int index = 0;
		for(String key: maplist.keySet()) {
			ArrayList<String> list = maplist.get(key);
			for(String t: list) {
				array[index] = t;
				index ++;
			}
		}
	}
	

	
	
	String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	@Override
	public int compare(String s1, String s2) {
		return sortChars(s1).compareTo(sortChars(s2));
	}
}
