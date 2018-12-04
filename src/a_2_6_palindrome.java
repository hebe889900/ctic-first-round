import CtCILibrary.LinkedListNode;

public class a_2_6_palindrome {
	static //1.Reverse and compare
	boolean isPalindrome (LinkedListNode head) {
		LinkedListNode reversed = reverseAndClone(head);
		return isEqual(head, reversed);
	}
	
	static LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = null;
		while(node != null) {
			LinkedListNode n = new LinkedListNode(node.data, null, null);
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
	
	static boolean isEqual(LinkedListNode one, LinkedListNode two) {
		while(one != null && two != null) {
			if(one.data != two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode node = new LinkedListNode();
		LinkedListNode node_2 = new LinkedListNode();
		LinkedListNode node_3 = new LinkedListNode();
		LinkedListNode node_4 = new LinkedListNode();
		LinkedListNode node_5 = new LinkedListNode();
		LinkedListNode node_6 = new LinkedListNode();
		LinkedListNode node_7 = new LinkedListNode();
		
		node.data = 1;
		node.setNext(node_2);
		node_2.data = 2;
		node_2.setNext(node_3);	
		node_3.data = 2;
		node_3.setNext(node_4);
		node_4.data = 4;
		node_4.setNext(node_5);
		node_5.data = 2;
		node_5.setNext(node_6);
		node_6.data = 2;
		node_6.setNext(node_7);
		node_7.data = 1;
		
		System.out.println(node.printForward());
		System.out.println(isPalindrome(node));		

	}
}
