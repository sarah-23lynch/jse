package mex.s05;

public class Exercise1 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
    	if (s == null) {
    		return null;
    	}
       StringBuilder result = new StringBuilder();
       for (int i=s.length()-1; i< s.length();i--) {
    	   char c= s.charAt(i);
    	   
    	   result.append(c);
       }
       
        return result.toString();
    }
}
