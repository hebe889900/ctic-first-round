
public class a_8_3_magic_index_bf {
	int magicSlow(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == i) {
				return i;
			}
		}
		return  -1;
	}
}
