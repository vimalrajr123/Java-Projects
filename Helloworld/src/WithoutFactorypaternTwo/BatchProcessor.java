package WithoutFactorypaternTwo;

import java.io.File;
import java.util.List;

public class BatchProcessor {

	public void processBatch(String fileName, String format) {
		
		File file = openFile(fileName);	
		
		TextParser parser = null;
		if(format.equals("csv")){
			parser = new CSVParser(file);
		}else if(format.equals("txt")) {
			parser = new TextParser(file);	
		}
		
		List<Record> records = parser.getRecords();
		processRecords(records);
		writeSummary();
		closeFile(file);
		
	}

	private void processRecords(List<Record> records) {
		// TODO Auto-generated method stub
		System.out.println("processing the file");
		
	}

	private File openFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("File opened");
		return null;
	}

	private void closeFile(File file) {
		// TODO Auto-generated method stub
		System.out.println("File closed");
		
	}

	private void writeSummary() {
		// TODO Auto-generated method stub
		System.out.println("Wrote Summary");
		
	}


}
