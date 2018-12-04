import java.util.Stack;

public class a_3_4_my_queue<T> {
	Stack<T> stackNewest, stackOldest;
	
	public a_3_4_my_queue() {
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	public int size() {
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T value) {
		stackNewest.push(value);
	}
	
	private void shiftStacks() {
		if(stackOldest.isEmpty()) {
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek() {
		shiftStacks();
		return stackOldest.peek();
	}
	
	public T remove() {
		shiftStacks();
		return stackOldest.pop();
	}
}
