package mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class substringModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long m = 7;
		List<Long> a = new ArrayList<>();
		a.add(3l);
	//	a.add(3l);
		a.add(9l);
		a.add(9l);
		a.add(5l);
		
		  int len = a.size();
		   
	        String[] arr = new String [len* (len+1) /  2];
	        String s= "";
	        
	        for(int i=0;i<len;i++){
	          s = s + String.valueOf(a.get(i));
	        }
	       int temp = 0;
	       
	       Set<String> sets = new HashSet<>();
	       for(int i=0; i<len;i++){
	           for(int j=i;j<len;j++){         
	               arr[temp] = s.substring(i, 1+j);
	               sets.add(arr[temp]);
	               temp ++;
	                          
	           }
	       }
	       
	    for(String setsl : sets) {
	    	System.out.print(" " + setsl);
	    }
	    System.out.println("");
	    System.out.println("_________________________");
	       
	    //   long kk =0;
	       long num = 0;
	       
	       List<String> listK = sets.stream().collect(Collectors.toList());
	       
	       for(int i=0; i<sets.size();i++){

	    	   String ele = listK.get(i);
	           String[] s1 = ele.split("");
				
				//  for(String g : s1) { System.out.print(" " + g); }
				  System.out.println(" ");
				 
	           long kk =0;
	           for(int j=0; j<s1.length;j++){
	               kk = Long.valueOf(s1[j]) + kk;
	              // System.out.print(" " + " "  + kk);
	           }
	           
	          
	           
	           
	            long rou = kk % m;
	            num = rou + num;
	            
	            System.out.print(" " + ele + " "  + kk + " " + num);
	                
	       }
	       System.out.println("");
	       System.out.println(num);

	    }

	}


// 3 % 7 = 3 (add all subsert answer 26)

