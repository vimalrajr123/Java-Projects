package WithoutFactorypaternTwo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		BatchProcessor processor = new BatchProcessor();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input");
		String fileName = s.nextLine();
		String format = s.nextLine();
		processor.processBatch(fileName, format);
		// TODO Auto-generated method stub
		s.close();

	}

}
