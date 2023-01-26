package WithFactoryPattern;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {

	// Factory Method
	public abstract Parser createParser(File file);

	public final void processBatch(String fileName) {

		File file = openFile(fileName);

		Parser parser = createParser(file);
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
