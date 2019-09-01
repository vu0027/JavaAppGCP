import java.util.Random; 
import java.util.*;

public class Project1 {
	public static void main(String args[]) 
    { 
        // create instance of Random class 
        Random rand = new Random(); 
        List<Integer> list = new ArrayList<Integer>();

        // Generate random integers in range 0 to 999 
        int rand_int1 = 0;
        for(int i = 0; i < 1000; i++) {
        // Print random integers 
            rand_int1 = rand.nextInt(1000000000); 
            list.add(rand_int1);
        	System.out.println(rand_int1); 
        }
        
        
    } 
}
