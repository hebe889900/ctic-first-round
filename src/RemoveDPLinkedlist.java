import java.util.HashSet;
import java.util.Hashtable;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;


public class RemoveDPLinkedlist {
	
	public static void deleteDupsA(LinkedListNode n) {
		HashSet<Integer> myset= new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n != null) {
			if(myset.contains(n)){
				previous.next = n.next;
			}else{
				myset.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}	
	
	public static void deleteDupsC(LinkedListNode head) {
		LinkedListNode current = head;
		while(current != null) {
			LinkedListNode runner = current;
			while(runner.next != null) {
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next; //(count + 1)
				}
			}
			current = current.next;
		}
	}	
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		LinkedListNode clone = head.clone();
		deleteDupsA(head);
		System.out.println(head.printForward());
		deleteDupsC(clone);
	}
}
