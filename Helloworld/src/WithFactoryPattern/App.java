package WithFactoryPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter input");
		String fileName = s.nextLine();
		String format = s.nextLine();
		BatchProcessor processor = createParser(format);
		processor.processBatch(fileName);
		s.close();

	}

	private static BatchProcessor createParser(String format) {
		// TODO Auto-generated method stub
		if (format.equals("txt")) {
			return new TextParserProcessor();
		} else if (format.equals("csv")) {
			return new CSVParserProcessor();
		}
		return null;
	}

}
