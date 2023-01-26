package com.java.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Elvis implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Elvis  inst = new Elvis();
    private Elvis() {
        System.out.println("In elvis constructor ");
    }

    public static Elvis getInstance() {
        return inst;
    }
    
    
	
	  protected Object readResolve() { return inst; }
	 
}

public class SingletonSerializeDeserial{
	
	public static void main(String arg[]) throws IOException, ClassNotFoundException {

FileOutputStream fos = new FileOutputStream("C:\\Users\\vimal\\eclipse-workspace\\JavaProject\\src\\com\\java\\solid\\principle\\myserial1.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
Elvis e = Elvis.getInstance();
System.out.println(" e = "+e.getInstance());

oos.writeObject(e);

System.out.println("Serialization done.");
FileInputStream fis = new FileInputStream("C:\\Users\\vimal\\eclipse-workspace\\JavaProject\\src\\com\\java\\solid\\principle\\myserial1.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
Elvis el = (Elvis) ois.readObject();
System.out.println(" el = "+el.getInstance());


System.out.println("Hashode 1  : " + e.hashCode());
System.out.println("Hashode 2  : " + el.hashCode());
}
}