package mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class newOne {
	
	 public static void main(String[] args) {
	
	
	String N = "666";
	int n = Integer.parseInt(N);
	int temp = 0;
	
    List<Integer> list = new ArrayList<>();
    
    for(int i=n;i>0;i--) {
    	String[] arr = String.valueOf(i).split("");
    	Set<String> set = new HashSet<>();
    	for(String hh : arr) {
    		
    		set.add(hh);
    		temp = Integer.parseInt(hh);
    	}
    	
    	if(set.size() == 1) {
    		 int prime = getPrime(temp);
    		 if(prime == 0) {
    		 System.out.println("output"  + i);
    		break;
    		 }
    	}
    }

}

	private static int getPrime(int n) {
		// TODO Auto-generated method stub
		
		int i,m=0,flag=0;      
		  //it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		  // System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		//     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { 
			//   System.out.println(n+" is prime number");
			   }  
		  }//end of else  
		return flag;
	}

/*
 * private static int getPrime(int N) { // TODO Auto-generated method stub
 * 
 * int ct=0; int n=0;int i=1; int j=1; while (n<N) { j=1; ct=0; while(j<=i){
 * if(i%j == 0) ct++; j++; } if(ct==2){ list.add(i); n++; } i++; } return
 * parseInt; }
 */
	
	/*
	 * int[] arr = {2,5},{2,5},{5,5},{2,5,5};
	 * 
	 * Set<Integer> set = new HashSet<>(); for(int j=0;j<arr.length;j++){
	 * 
	 * int[] array = arr[j]; for(int i : array){ set.add(i); } }
	 * 
	 * int total = 0;
	 * 
	 * for(int i : set){ total = total+ i;
	 * 
	 * }
	 * 
	 * return Long.valueOf(total%1000000007);
	 */





}
