import CtCILibrary.LinkedListNode;
import CtCILibrary.Result;

public class a_2_7_intersection {
	static LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
		if(list1 == null && list2 == null) {
			return null;
		}
		
		Result result1 = getTailAndSize(list1);
		Result result2 = getTailAndSize(list2);
		
		if(result1.tail != result2.tail) {
			return null;
		}
		
		LinkedListNode shorter = result1.size <= result2.size ? list1 : list2;
		LinkedListNode longer = result1.size > result2.size ? list1 : list2;
		
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));
		
		while(shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		
		return longer;
	}
	
	static Result getTailAndSize(LinkedListNode list) {
		if (list == null) return null;
		
		int size = 1;
		LinkedListNode current = list;
		while (current.next != null) {
			size++;
			current = current.next;
		}
		return new Result(current, size);
	}
	
	static LinkedListNode getKthNode(LinkedListNode head, int k) {
		LinkedListNode current = head;
		while (k > 0 && current != null) {
			current = current.next;
			k--;
		}
		return current;
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

		LinkedListNode node_a = new LinkedListNode();
		LinkedListNode node_2a = new LinkedListNode();
		node_a.data = 4;
		node_a.setNext(node_2a);
		node_2a.data = 6;
		node_2a.setNext(node_5);

		System.out.println(node.printForward());
		System.out.println(node_a.printForward());
		System.out.println(findIntersection(node, node_a).printForward());		

	}	
}
