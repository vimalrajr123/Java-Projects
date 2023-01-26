package WithFactoryPattern;

import java.io.File;

public class CSVParserProcessor extends BatchProcessor {

	@Override
	public Parser createParser(File file) {
		// TODO Auto-generated method stub
		return new CSVParser(file);
	}

}
