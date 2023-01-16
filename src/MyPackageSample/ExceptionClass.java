package MyPackageSample;

import java.io.IOException;



class M{  
	 	void method()throws IOException{  
	 		throw new IOException("device error");  
	 	}  
}  


public class ExceptionClass {

	public static void main(String[] args) throws IOException  {
		// Throws always has unchecked Exceptions only like IOException, FileNotFoundException, SQLException
		// M class is at at the top
	    try{  
		     M m=new M();  
		     m.method();  
		    }
	    catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}     
		    System.out.println("normal flow...");  

		try {
			//System.out.println(x/0);
			throw new UserDefinedException("My New exception");
		}
		
		catch(UserDefinedException s) {
			System.out.println(s);
		}
		

//		catch(ArithmeticException e) {
//			System.out.println("Exception occured"+e);
//		}
//		//parent exception should always at the bottom
//		catch(Exception e) {
//			System.out.println("Exception occured"+e);
//		}
		
		finally {
			System.out.println("finally block always run regardless of exception or not");
		}


	}

}

