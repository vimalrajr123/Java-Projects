package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class replaceRajan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String name = "ravi"; 
        int count = 0;   
        
        int n = 2;//s.nextInt();
        List<String> list = new ArrayList<>();
       // for(int i=0;i<n;i++){
           // String m = s.nextLine();
         list.add("hhh");
         list.add("vira");
    //    }
        
        for(String val : list){
        	String num1 = "";
            String num2 = "";
                char[] charVal = val.toCharArray();
                Arrays.sort(charVal);
               
               for(char i: charVal){
                  num1 = num1 + i;
               }
               System.out.println("charValue " + num1);
                String finalAns = num1;

                char[] nameVal = name.toCharArray();
                  Arrays.sort(nameVal);
                     for(char i: nameVal){
                  num2 = num2 + i;
                  
               }
                     System.out.println("NamValue " + num2);
               String value = num2;
               if(finalAns.equals(value)){
                   count = count + 1;
               }
               System.out.println("count" + count);
        }
       
            System.out.println(count);
	}

}
