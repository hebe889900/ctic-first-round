import CtCILibrary.LinkedListNode;

public class a_2_4_partition {
	static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		while(node != null) {
			LinkedListNode next = node.next;
			next = null;
			if(node.data < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if(beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	
	static LinkedListNode partition_1(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		
		return head;
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
		
		node.data = 5;
		node.setNext(node_2);
		node_2.data = 2;
		node_2.setNext(node_3);	
		node_3.data = 2;
		node_3.setNext(node_4);
		node_4.data = 4;
		node_4.setNext(node_5);
		node_5.data = 3;
		node_5.setNext(node_6);
		node_6.data = 1;
		node_6.setNext(node_7);
		node_7.data = 5;
		
		System.out.println(node.printForward());
		System.out.println(partition_1(node, 3).printForward());		

	}

}
