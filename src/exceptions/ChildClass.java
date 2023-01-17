package exceptions;

import java.io.*;

public class ChildClass extends ParentClass {
	
	void msg() throws ArithmeticException {    
		    System.out.println("child method");    
		  }  
	
	public static void main(String args[]){//declare exception 
		
		ParentClass p = new ChildClass();
		   try {    
			   p.msg();    
			   }  
			   catch(Exception e) {}    
			  }    
	}

