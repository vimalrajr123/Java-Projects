package serializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import collectionProject.Student;

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student s = new Student(20, "atharva", 30, 4000);
		
		FileOutputStream outFile = new FileOutputStream("file123.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(outFile);
		
		out.writeObject(s);
		
		out.flush();
		out.close();

	}

}
