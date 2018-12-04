import java.util.HashSet;

import CtCILibrary.LinkedListNode;

public class a_2_1_remove_dups {
	static void deleteDups(LinkedListNode n) {
		HashSet<Integer> result = new HashSet<Integer>();
		LinkedListNode previous = null;
		
		while (n != null) {
			if (result.contains(n.data)) {
				previous.next = n.next;
			}
			else {
				result.add(n.data);
				previous = n;
			}
			n = n.next;
		}
		
		
		
	}
	
	
	//no buffer
	static void deleteDups_nobuffer(LinkedListNode head) {
		LinkedListNode current = head;
		while(current != null) {
			LinkedListNode runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
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
		node_4.data = 3;
		node_4.setNext(node_5);
		node_5.data = 3;
		node_5.setNext(node_6);
		node_6.data = 4;
		node_6.setNext(node_7);
		node_7.data = 5;
		
		System.out.println(node.printForward());
		deleteDups_nobuffer(node);
		System.out.println(node.printForward());
	}
}
