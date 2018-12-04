import CtCILibrary.LinkedListNode;

public class a_2_3_delete_middle_node {
	static boolean deleteNode(LinkedListNode n) {
		if(n == null || n.next == null) {
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
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
		deleteNode(node_3);
		System.out.println(node.printForward());
	}	
}
