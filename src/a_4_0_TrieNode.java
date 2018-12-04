import java.util.HashMap;

public class a_4_0_TrieNode {
	private HashMap<Character, a_4_0_TrieNode> children;
	private boolean terminates = false;
	
	private char character;
	
	public a_4_0_TrieNode() {
		children = new HashMap<Character, a_4_0_TrieNode> ();
	}
	
	public a_4_0_TrieNode(char character) {
		this();
		this.character = character;
	}
	
	public char getChar() {
		return character;
	}
	
	public void addWord(String word) {
		if(word == null || word.length() == 0) { 
			return;
		}
		
		Character firstChar = word.charAt(0);
		a_4_0_TrieNode child = getChild(firstChar);
		if(child == null) {
			child = new a_4_0_TrieNode(firstChar);
			children.put(firstChar, child);
		}
		
		if(word.length() > 1){
			child.addWord(word.substring(1));		
		} else {
			child.setTerminates(true);
		}
	}
	
	public a_4_0_TrieNode getChild(char c) {
		return children.get(c);
	}
	
	public boolean terminates() {
		return terminates;
	}
	
	public void setTerminates(boolean t) {
		terminates = t;
	}
}
