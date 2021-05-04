package mex.s03;

public class Exercise2 {
	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return true if odd
	 */
	public static boolean isOdd(int value) {

		boolean condition = (value % 2 > 0);
		boolean otherCondition = (value % 2 == 0);
		boolean exception = (value == 0);

		if (condition) {

			return true;
			
		} else if (otherCondition) {

			return false;
			
		} else if  (exception) {
				
				return false; 
				
			}
			 return exception;
		} 
	}