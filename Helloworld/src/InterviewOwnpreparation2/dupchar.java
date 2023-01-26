package InterviewOwnpreparation2;

import java.util.HashSet;
import java.util.Set;

public class dupchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  String str = "ww3schoolsos";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  Set<String> s = new HashSet<>();
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		 //    System.out.println(inp[j]);
		     s.add(String.valueOf(inp[j]));
		  //   cnt++;
		 //   break;
		    }
		   }
		  }
		  
		  System.out.println(s);

	}

}
