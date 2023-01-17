package exceptions;

public class TryCatchThrowThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		
		try {
			int a=i/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e){
			
			System.out.println("Divide by Zero");
			System.out.println(e);
		}
		
        catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		//Exception need to be at last...otherwise compile time Error
		catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }             
		
		finally {
			System.out.println("finally block always runs regardsless whether ther is exception or not");
		}

	}

}
