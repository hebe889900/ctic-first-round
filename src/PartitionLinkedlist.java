import CtCILibrary.LinkedListNode;
public class PartitionLinkedlist {
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
		while(node != null) {
			LinkedListNode next = node.next;
			node.next = null;//Aviod stack overflow
			if(node.data < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				}else{
					beforeEnd.next = node;//Because node has incremented.
					beforeEnd = node;
				}
			}else{
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				}else{
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
	
	public static void main(String[] args) {
		/* Create linked list */
		int[] vals = {1, 3, 7, 5, 2, 9, 4};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		
		/* Partition */
		LinkedListNode h = partition(head, 5);
		
		/* Print Result */
		System.out.println(h.printForward());
	}
}
