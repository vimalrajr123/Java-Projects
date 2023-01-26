package mypack;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//swapping minimum
			
			int[] a = {4,3,0,1};
	        int swap=0;
	        for(int i=0;i<a.length;i++){
	            if(i+1!=a[i]){
	                int t=i;
	                while(a[t]!=i+1){
	                    t++;  
	                }
	                int temp=a[t];
	                a[t]=a[i];
	                a[i]=temp;
	                swap++;
	            }
	        }
	        
	        System.out.println(swap);
	        
	        for(int i=0;i<a.length;i++) {
	        System.out.println(a[i]);
	        }
	    //    return swap;

	  

	}

}
