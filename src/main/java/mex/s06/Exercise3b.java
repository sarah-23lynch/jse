package mex.s06;

public class Exercise3b {
	/**
	 * Find the smallest value [5, 4, 74, -12, 0]
	 * 
	 * @param data
	 * @return the smallest value
	 */
	public static int max(int[] data) {

		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad data input");
		}
		// i need to inis. a temporary variable: result
		int result = data[0]; // inis. the first one cuz i dont know if its the min
		for (int i = 1; i < data.length; i++) { // check each value
			if (data[i] < result) { // check if curr. value is smaller than the one taken before
				result = data[i]; // if yes result becomes that value
			}
		}

		return result;
	}
}
