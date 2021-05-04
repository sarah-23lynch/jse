package m02.s10.ex;

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: print all values in [0 .. 9]
        //for loop
       
    	for (int cur = 0; cur < 10; cur++) {
    		System.out.println(cur);
    	}
    	System.out.println("---");
    	
    	//while loop
    	int cur = 0;
    	while (cur < 10) {
    		System.out.println(cur);
    		cur ++;
    	}
    
    	System.out.println("---");
    	
    	//do-while loop
    	int i= 0;
    			do {
    				System.out.println(i);
    				i ++;
    			} while (i < 10);
    			}


}
