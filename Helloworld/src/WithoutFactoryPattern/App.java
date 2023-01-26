package WithoutFactoryPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		BatchProcessor processor = new BatchProcessor();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input");
		String fileName = s.nextLine();
		processor.processBatch(fileName);
		// TODO Auto-generated method stub
		s.close();

	}

}
