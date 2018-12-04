import CtCILibrary.LinkedListNode;

public class a_2_2_return_kth_to_last {
	static int printKthToLat(LinkedListNode head, int k ) {
		if(head == null) {
			return 0;
		}
		int index = printKthToLat(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}
	
	//Wrapper Class
	class Index {
		public int value = 0;
	}
	
	LinkedListNode kthToLast(LinkedListNode head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}

	private LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) {
		// TODO Auto-generated method stub
		if(head == null) {
			return null;
		}
		LinkedListNode node = kthToLast(head.next, k, idx);
		idx.value += 1;
		if(idx.value == k) {
			return head;
		}
		return node;
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
		
		printKthToLat(node, 2);
	}	
	

}

