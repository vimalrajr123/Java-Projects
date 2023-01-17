package exceptions;

import java.io.*;

public class ChildClass extends ParentClass {
	
	void msg()  {    
		    System.out.println("child method");    
		  }  
	
	public static void main(String args[])throws IOException{//declare exception 
		
		ChildClass c = new ChildClass();
		c.msg();
	}
	
	
	
	

}
