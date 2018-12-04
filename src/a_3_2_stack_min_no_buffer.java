import java.util.Stack;

public class a_3_2_stack_min_no_buffer extends Stack<Integer> {
	Stack<Integer> s2;
	public a_3_2_stack_min_no_buffer() {
		s2 = new Stack<Integer>();
	}
	
	public void push(int value) {
		if (value <= min()) {
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;
	}
	
	public int min() {
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}
	}
}
