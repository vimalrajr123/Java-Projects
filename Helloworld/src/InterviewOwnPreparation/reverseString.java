package InterviewOwnPreparation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class reverseString {

	
	static char[] replaceAll(char[]  str, char oldChar, char newChar)
	{
	    int i = 0;

	    /* Run till end of string */
	    while(str[i] != '\0')
	    {
	        /* If occurrence of character is found */
	        if(str[i] == oldChar)
	        {
	            str[i] = newChar;
	        }
	        
	        else if(str[i] == newChar){
	        	str[i] = oldChar;
	        }
	        

	 if(i<8) {
	        i++;
	        }
	 else {
		 break;
	 }
	    }
		return str;
	}
	
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		String s = "xxooiihhi";
		char[] str = s.toCharArray();
		String s1= "";
		
		for(int i=8; i>=0;i--) {
			s1=s1+str[i];
		}
		
		 System.out.println("reverse " + s1);
		
		char[] str1 = s1.toCharArray();
		 char[] n = replaceAll(str1, 'o','i');
		  
		
		  String ss = String.valueOf(n);
		  System.out.println("chnaged " + ss);
		  
		  InetAddress myIP=InetAddress.getLocalHost();
		  
	      /* public String getHostAddress(): Returns the IP 
	       * address string in textual presentation.
	       */
	      System.out.println("My IP Address is:" + myIP.getHostAddress());
		  
		  
		  
	}

}
