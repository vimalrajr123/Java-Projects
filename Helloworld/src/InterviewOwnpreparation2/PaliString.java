package InterviewOwnpreparation2;

import java.util.Scanner;

public class PaliString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter a String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String duplicate=str;
		String revstring="";
		int len=str.length();
		int i=0;

		for(i=len-1;i>=0;i--) 
		{
			revstring=revstring+str.charAt(i);
		}
		if(duplicate == revstring)
		{
			System.out.println(duplicate + " is a Palindrome String");
		}
		else
		{
			System.out.println(duplicate + " is not a Palindrome String");
		}

	}

}
