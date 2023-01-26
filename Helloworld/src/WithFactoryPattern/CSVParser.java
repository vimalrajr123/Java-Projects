package WithFactoryPattern;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser{

	public CSVParser(File file) {
		// TODO Auto-generated constructor stub
		System.out.println("Csv file parsed");
	}
	
	public List<Record> getRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
