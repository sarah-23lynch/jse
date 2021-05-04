package m02.s10.ex;

import java.util.Arrays;

public class Exercise2 {
	public static void main(String[] args) {
        boolean[] flags = { true, false, false };
        System.out.println(Arrays.toString(flags));

        //  swap the values in the given boolean array and then print it
       for (int i= 0;i <flags.length; i++) {
    	   
    	   if (flags[i]) {
    		     flags[i] = false;		  
       } else {
    	   flags[i] = true;   
    	  
       }
	}
	 System.out.println(Arrays.toString(flags)); 
	
	}
}
