import java.util.ArrayList;

public class a_4_0_Tries {
	private a_4_0_TrieNode root;
	
	public a_4_0_Tries(ArrayList<String> list) {
		root = new a_4_0_TrieNode();
		for (String word : list) {
			root.addWord(word);
		}
	}
	
	public a_4_0_Tries(String[] list) {
		root = new a_4_0_TrieNode();
		for (String word : list) {
			root.addWord(word);
		}
	}
	
	public boolean contains(String prefix, boolean exact) {
		a_4_0_TrieNode lastNode = root;
		for (int i = 0; i < prefix.length() ;i++) {
			lastNode = lastNode.getChild(prefix.charAt(i));
			if(lastNode == null) {
				return false;
			}
		}
		return !exact || lastNode.terminates();
	}
	
	public a_4_0_TrieNode getRoot() {
		return root;
	}
	
	public static void main(String[] args) {
		String[] arr = new String[]{"a","aaa","aab","ac","ba","bd","bdcc","bae"};
		a_4_0_Tries trie = new a_4_0_Tries(arr);
		System.out.println(trie.contains("ba", false));
	}
}
