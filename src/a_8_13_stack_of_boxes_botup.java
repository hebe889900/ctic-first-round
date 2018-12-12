import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a_8_13_stack_of_boxes_botup {
	int createStack(ArrayList<Box> boxes) {
		Collections.sort(boxes, new BoxComparator());
		int maxHeight = 0;
		int[] stackMap = new int[boxes.size()];
		for (int i = 0; i < boxes.size(); i++) {
			int height = createStack(boxes, i, stackMap);
			maxHeight = Math.max(maxHeight, height);
		}
		return maxHeight;
	}
	
	int createStack(ArrayList<Box> boxes, int bottomIndex, int[] stackMap) {
		if (bottomIndex < boxes.size() && stackMap[bottomIndex] > 0) {
			return stackMap[bottomIndex];
		}
		Box bottom = boxes.get(bottomIndex);
		int maxHeight = 0;
		for (int i = bottomIndex + 1; i < boxes.size(); i++) {
			if (boxes.get(i).canBeAbove(bottom)) {
				int height = createStack(boxes, i, stackMap);
				maxHeight = Math.max(height, maxHeight);
			}
		}
		maxHeight += bottom.height;
		stackMap[bottomIndex] = maxHeight;
		return maxHeight;
	}
	
	
	class BoxComparator implements Comparator<Box> {
		@Override
		public int compare(Box x, Box y) {
			return y.height - x.height;
		}
	}
}
