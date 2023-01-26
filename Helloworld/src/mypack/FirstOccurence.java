package mypack;

public class FirstOccurence {
	
	public static void main(String[] args)   {
		 
		 
		 String str  = "aaabbbddhnnehhiiaak";
		 int n = str.length();
		
		 for(int i=0;i<n;i++) {
			 boolean  repeated = false;
			 for(int j=0;j<n;j++) {
				 if(str.charAt(i) == str.charAt(j) && i!=j) {
					 
					 repeated = true;
					 break;
				 }
			 }
			 
			 if(!repeated) {
				 System.out.println(str.charAt(i));
				 break;
			 }
		 }
		 
	 }

}
