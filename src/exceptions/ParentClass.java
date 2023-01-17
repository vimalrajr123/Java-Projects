package exceptions;

import java.io.*;

public class ParentClass {
	// ----case 1: If the superclass method does not declare an exception.-----
	//rule 1: parent not handling exception and subclass with checked exception (compile time error)
	//rule 2 : parent not handling exception and subclass overridden method can declare unchecked exception..
	
	
	//case 2:If the superclass method declares an exception
	//rule 1 : parent should be Parent Exception or same exception as child (or else compile time error)
	
	//throws should declare checked exception only
	//throw can be any including user defined exception.
	
	  void msg() throws Exception {  
		    System.out.println("parent method");  
		    }  

}
