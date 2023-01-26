package InterviewOwnPreparation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class bbb {
	  public static void main(String[] args) 
	    { 
	        List<String> list = new LinkedList<String>(); 
	        list.add("Geeks"); 
	        list.add("for"); 
	        list.add("Geeks"); 
	        list.add("Practice"); 
	  
	        String[] arr = list.toArray(new String[list.size()]); 
	  
	        
	        for (String x : arr) 
	            System.out.print(x + " "); 
		  
			/*
			 * String array[] = { "Geeks", "forGeeks", "A computer Portal" }; List<String>
			 * list = Arrays.asList(array);
			 * 
			 * // Return the converted List System.out.print(list);
			 */
	    } 
}
