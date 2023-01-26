package WithFactoryPattern;

import java.io.File;

public class TextParserProcessor extends BatchProcessor {

	@Override
	public Parser createParser(File file) {
		// TODO Auto-generated method stub
		return new TextParser(file);
	}

}
