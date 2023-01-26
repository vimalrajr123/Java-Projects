package InterviewOwnpreparation2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Remonchar {
	static char[] removeAll(char[]  str, char removeChar)
	{
	    int i = 0;

	    /* Run till end of string */
	    while(str[i] != '\0')
	    {
	        /* If occurrence of character is found */
	        if(str[i] == removeChar)
	        {
	            str[i] = '\0';
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
		System.out.println("Before " + s1);
		
		
		char[] str2 = s1.toCharArray();
		
		char[] str1 = removeAll(str2, 'h');
		
		String my = new String(str1);
		System.out.println("Replace" + my);
		
		
		  
		  
		  
	}

}


