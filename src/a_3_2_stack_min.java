import java.util.Stack;

public class a_3_2_stack_min extends Stack<NodeWithMin> {
	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int min() {
		if(this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
}
