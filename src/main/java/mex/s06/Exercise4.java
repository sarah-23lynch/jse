package mex.s06;

public class Exercise4 {
	/**
	 * Find a non duplicated value
	 * 
	 * @param data
	 * @return a non duplicated value 
	 * [1, 4, 2, 3,3, 2, 1] [1,2,3]
	 */
	public static int single(int[] data) {

		for (int i = 0; i < data.length; i++) {
			boolean found = false;
			for (int j = 0; j < data.length; i++) {
				if (j == i) {
					continue;
				}else if (data[i]== data [j]) {
					found = false;
					break;
				}
			}
			if (found) {
				return data[i];
			}
		}
return Integer.MIN_VALUE;
	}
}
