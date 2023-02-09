package designsingletonPattern;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializeDeserialize implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonSerializeDeserialize ps ;
	
	//Eager instantiation******************************
	//private static SingletonSerializeDeserialize ps =  new SingletonSerializeDeserialize();  
	
	
	private SingletonSerializeDeserialize() {
		System.out.println("Instance Created");
		
	}
	//whenever file read object happens it should return the singletonObjet "PS"
	protected Object readResolve () {
		return ps;
	}

	public static SingletonSerializeDeserialize getobj() {
		//Lazy instantiation******************************
		if(ps==null)
		{
			ps= new SingletonSerializeDeserialize();
		}
		return ps;
	}
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream f1 = new FileOutputStream("/Users/vimalraj/Google Drive/Java Projects/collectionProject/src/singletonPattern/vimal.txt");
		ObjectOutputStream out1 = new ObjectOutputStream(f1);
		SingletonSerializeDeserialize s1 = SingletonSerializeDeserialize.getobj();
		out1.writeObject(s1);
		System.out.println("serialization done");
		
		FileInputStream f2 = new FileInputStream("/Users/vimalraj/Google Drive/Java Projects/collectionProject/src/singletonPattern/vimal.txt");
		ObjectInputStream out2 = new ObjectInputStream(f2);
		SingletonSerializeDeserialize s2 = (SingletonSerializeDeserialize) out2.readObject();
		System.out.println("deserialization done");
		
		System.out.println(s1.hashCode()+" "+s2.hashCode());

	}

}
