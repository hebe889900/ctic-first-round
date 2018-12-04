import CtCILibrary.LinkedListNode;

public class a_2_5_sum_list {
	static LinkedListNode addList(LinkedListNode l1, LinkedListNode l2, int carry) {
		if(l1 == null && l2 == null && carry == 0) {
			return null;
		}
		
		int value = carry;
		LinkedListNode result = new LinkedListNode();
		
		if(l1 != null) {
			result.data += l1.data;
		}
		
		if(l2 != null) {
			result.data += l2.data;
		}
		
		result.data = result.data % 10;
		
		if(l1 != null || l2 != null){
			LinkedListNode more = addList(l1 == null ? null: l1.next, l2 == null ? null : l2.next, value >= 10 ? 1 : 0 );
			result.setNext(more);
		}
		
		return result;
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
		System.out.println(node_4.printForward());
		addList(node, node_4,0);
		System.out.println(addList(node, node_4,0).printForward());		

	}	
}
