package MyPackageSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("");
		int x=10;
		
		try {
			System.out.println(x/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured"+e);
		}
		catch(Exception e) {
			System.out.println("Exception occured"+e);
		}

	}

}
