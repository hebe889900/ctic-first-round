import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class a_8_13_stack_of_boxes_topdown {
	int createStack(ArrayList<Box> boxes) {
		Collections.sort(boxes, new BoxComparator());
		int[] stackMap = new int[boxes.size()];
		return createStack(boxes, null, 0, stackMap);
	}
	
	int createStack(ArrayList<Box> boxes, Box bottom, int offset, int[] stackMap) {
		if (offset >= boxes.size()) {
			return 0;
		}
		
		Box newBottom = boxes.get(offset);
		int heightWithBottom = 0;
		if (bottom == null || newBottom.canBeAbove(bottom)) {
			if (stackMap[offset] == 0) {
				stackMap[offset] = createStack(boxes, newBottom, offset + 1, stackMap);
				stackMap[offset] += newBottom.height;
			}
			heightWithBottom = stackMap[offset];
		}
		int heightWithOutBottom = createStack(boxes, bottom, offset + 1, stackMap);
		
		return Math.max(heightWithBottom, heightWithOutBottom);
	}
	
	class BoxComparator implements Comparator<Box> {
		@Override
		public int compare(Box x, Box y) {
			return y.height - x.height;
		}
	}	
}
