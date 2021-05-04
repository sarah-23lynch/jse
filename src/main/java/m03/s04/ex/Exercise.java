package m03.s04.ex;

public class Exercise {
	private static final int GAP = 'a' - 'A'; // charset independent
//    private static final int ALPHABET_SIZE = 26;  // standard alphabet

	/**
	 * A simpler version of String.toUpperCase()
	 * 
	 * Build the result in a StringBuilder, then convert it to String and return it
	 * 
	 * Do not use any method in String!
	 * 
	 * @param s
	 * @return uppercase version of input
	 */
	public String toUpper(String s) {
		// TODO: create an uppercase version of the input and return it
		if (s == null)
			return null;

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z') {
				c = (char) (c - GAP);
			}

			result.append(c);
		}

		return result.toString();
	}

	public String caesarEncrypt(String input, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	// * Encrypt an uppercase string using the Caesar's algorithm
	// *
	// * @param s a string (uppercase only)
	// * @param shift encrypting key
	// * @return the encrypted string

//	public //String caesarEncrypt(String s, int shift) {
	// TODO: create an encrypted version of the input and return it
	// return s;
}
