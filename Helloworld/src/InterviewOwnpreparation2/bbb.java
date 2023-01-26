package InterviewOwnpreparation2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class bbb {
	  public static void main(String[] args) 
	    { 
	        List<String> list = new ArrayList<>(); 
	        list.add("Geeks"); 
	        list.add("for"); 
	        list.add("Geeks"); 
	        list.add("Practice"); 
	        
	        for (String x : list) 
	        	System.out.print(x + " ");
	        
	        System.out.println(" ");
	        
	        List list1 = new ArrayList(); 
	        list1.add("dhivya"); 
	        list1.add(123344); 
	        list1.add("jayapaul"); 
	        list1.add("bow bow");
	        list1.add(45.55);
	        list1.add(202L);
	        list.addAll(list);
	        
	        for (Object x : list1) 
	        	System.out.print(x + " ");
	        
	        
	        System.out.println("\n final");
	        
		/*
		 * list.addAll(list1);
		 * 
		 * for (Object x : list) System.out.print(x + " ");
		 */
	        
           list.addAll(list1);
	        
	        for (String x : list) 
	        	System.out.print(x + " ");
	        
	  
		/*
		 * String[] arr = list.toArray(new String[1]);
		 * 
		 * for (String x : arr) System.out.print(x + " ");
		 */
		  
		/*
		 * String array[] = { "Geeks", "forGeeks", "A computer Portal" }; List<String>
		 * list = Arrays.asList(array);
		 * 
		 * // Return the converted List System.out.print(list);
		 */
	    } 
}
