package serializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import collectionProject.Student;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fileIn = new FileInputStream("file123.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Student s =(Student) in.readObject();
		System.out.println(s);
	}

}
