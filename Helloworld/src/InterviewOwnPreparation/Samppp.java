package InterviewOwnPreparation;

import java.util.LinkedList;
import java.util.List;

public class Samppp {

    public static void main(String[] args) throws Exception {
    	
    	 List<Integer> list = new LinkedList<Integer>(); 
         list.add(1); 
         list.add(2); 
         list.add(2); 
         list.add(3); 
   
         Integer[] arr = list.toArray(new Integer[0]); 
   
         for (Integer x : arr) 
             System.out.print(x + " "); 
    	
    	/* String str = "javaa";
         char[] ch = str.toCharArray();
         int i=0,j=0;
         for(i=0;i<ch.length;i++)
         {
             int count = 0 ;
             for( j = i+1;j<ch.length;j++)
             {//      4          6 , 8 , 10
                 if(ch[i] == ch[j] )                                           
                 {
                     count++;
                 }
             }
             if(count == 1)           
             {
                 System.out.print(ch[i] + " ");
             }


         }*/
     }
}
