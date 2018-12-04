import CtCILibrary.*;
public class GetKthFromEndLinkedList {

	public static int nthToLastR1(LinkedListNode head, int n) {
		if(head == null) {
			return 0;
		}
		int index = nthToLastR1(head.next,n) + 1;
		if(index == n) {
			System.out.println(n + "th to last node is" + head.data);
		}
		return index;
	}

	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		if (n <= 0) return null;
		
		// Move p2 n nodes into the list.  Keep n1 in the same position.
		for (int i = 0; i < n - 1; i++) { 
			if (p2 == null) {
				return null; // Error: list is too small.
			}
			p2 = p2.next;
		}
		if (p2 == null) { // Another error check.
			return null;
		}
		
		// Move them at the same pace.  When p2 hits the end, 
		// p1 will be at the right element.
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p1;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 3;
		//IntWrapper wr = new IntWrapper();
		//LinkedListNode n = nthToLastR3(head, nth);
		nthToLastR1(head, nth);
		//if (n != null) {
			//System.out.println(nth + "th to last node is " + n.data);
		//} else {
			//System.out.println("Null.  n is out of bounds.");
		//}
	}
}
