package mex.s06;

public class Exercise3 {
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
    	
    	if (data == null || data.length == 0) {
    		return Integer.MIN_VALUE;
    	}
        int result = data[0];     //varibaile temporanea dove metto il primo valore massimo
        
        for (int i =1; i< data.length; i++) {    // faccio il loop su ogni valore
        	if (data [i]> result) {   // mi chiedo se il valore corrente è maggiore della mia temporanea
        		result = data [i];    //se lo è la mia temporanea mi diventa quel valore li
        		
        	}
        }

        return result;
    }
}
