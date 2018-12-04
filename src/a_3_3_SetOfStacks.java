import java.util.ArrayList;
import java.util.EmptyStackException;

public class a_3_3_SetOfStacks {
	ArrayList<a_3_3_Stack> stacks = new ArrayList<a_3_3_Stack>();
	public int capacity;
	public a_3_3_SetOfStacks(int capacity) {
		this.capacity = capacity;
	}
	
	public a_3_3_Stack getLastStack() {
		if(stacks.size() == 0) {
			return null;
		} else {
			return stacks.get(stacks.size() - 1);
		}
	}
	
	public void push(int v) {
		a_3_3_Stack last = getLastStack();
		if(last != null && !last.isFull()) {
			last.push(v);
		} else {
			a_3_3_Stack stack = new a_3_3_Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		a_3_3_Stack last = getLastStack();
		if(last == null) {
			throw new EmptyStackException();
		}
		int v = last.pop();
		if(last.size == 0) {
			stacks.remove(stacks.size() - 1);
		}
		return v;
	}
	
	public boolean isEmpty() {
		a_3_3_Stack last = getLastStack();
		return last == null || last.isEmpty();
	}
	
	public int popAt(int index) {
		return leftShift(index, true);
	}
	
	public int leftShift(int index, boolean removeTop) {
		a_3_3_Stack stack = stacks.get(index);
		int removed_item;
		if (removeTop) {
			removed_item = stack.pop();
		} else {
			removed_item = stack.removeBottom();
		}
		
		if (stack.isEmpty()) {
			stacks.remove(index);
		} else if (stack.size > index + 1) {
			int v = leftShift(index + 1, false); // left shift until correct stack found
			stack.push(v); // remove the last item from that stack and push into last stack
		}
		return removed_item;
	}
}
