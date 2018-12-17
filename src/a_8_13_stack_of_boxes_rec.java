import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class a_8_13_stack_of_boxes_rec {
	public static void main(String[] args) {
		ArrayList<Box> stack = new ArrayList<Box>();
		stack.add(new Box(3, 4, 1));
		stack.add(new Box(8, 6, 2));
		stack.add(new Box(7, 8, 3));
		stack.add(new Box(9, 7, 2));
		a_8_13_stack_of_boxes_rec inst = new a_8_13_stack_of_boxes_rec();
		inst.createStack(stack);
		//ArrayList<Box> stack = createStackR(boxes, null);		
	}	
	
	
	int createStack(ArrayList<Box> boxes) {
		Collections.sort(boxes, new BoxComparator());
		int maxHeight = 0;
		for (int i = 0; i < boxes.size(); i ++) {
			int height = createStack(boxes, i);
			maxHeight = Math.max(height, maxHeight);
		}
		return maxHeight;
	}
	
	int createStack(ArrayList<Box> boxes, int bottomIndex) {
		Box bottom = boxes.get(bottomIndex);
		int maxHeight = 0;
		for(int i = bottomIndex + 1; i < boxes.size(); i++) {
			if(boxes.get(i).canBeAbove(bottom)) {
				int height = createStack(boxes, i);
				maxHeight = Math.max(maxHeight, height);
			}
		}
		maxHeight += bottom.height;
		return maxHeight;
	}
		
	
	class BoxComparator implements Comparator<Box> {
		@Override
		public int compare(Box x, Box y) {
			return y.height - x.height;
		}
	}
}
