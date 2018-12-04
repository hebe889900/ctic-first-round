import CtCILibrary.LinkedListNode;

public class a_2_8_find_beginning {

	static LinkedListNode FindBeginner(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		
		if (fast == null || fast.next == null) {
			return null;
		}
		
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
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
		
		node.data = 3;
		node.setNext(node_2);
		node_2.data = 1;
		node_2.setNext(node_3);	
		node_3.data = 5;
		node_3.setNext(node_4);
		node_4.data = 9;
		node_4.setNext(node_5);
		node_5.data = 7;
		node_5.setNext(node_6);
		node_6.data = 2;
		node_6.setNext(node_7);
		node_7.data = 1;
		node_7.setNext(node_4);
		
		System.out.println(FindBeginner(node));	
	}

}
