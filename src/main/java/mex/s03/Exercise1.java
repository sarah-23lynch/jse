package mex.s03;

public class Exercise1 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {

		if (value == 0) {
			return "zero";
		}

		if (value > 0) {
			return "positive";
		} else {

			return "negative";
		}

	}
}
