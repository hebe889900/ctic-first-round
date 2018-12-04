import java.util.ArrayList;

public class a_8_4_power_set_combinatorics {
	ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>> ();
		int max = 1 << set.size();
		for (int k = 0; k < max; k++) {
			ArrayList<Integer> subset = convertIntToSet(k, set);
			allsubsets.add(subset);
		}
		return allsubsets;
	}
	
	ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index = 0;
		for (int k = x; k > 0; k >>= 1) {
			if ((k & 1) == 1) {
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
	}
}
