package com.java.Singleton;

import java.io.IOException;

class Elviss implements Cloneable {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	public static final Elviss inst = new Elviss();

	private Elviss() {
		System.out.println("In elvis constructor ");
	}

	public static Elviss getInstance() {
		return inst;
	}

	protected Object clone() throws CloneNotSupportedException {
		//super.clone();
		throw new CloneNotSupportedException();
	}

}

public class SingletonClone {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

		Elviss e = Elviss.getInstance();
		System.out.println(" e = " + e.getInstance());

		Elviss el = (Elviss) e.clone();
		System.out.println(" el = " + el.getInstance());

		System.out.println("Hashode 1  : " + e.hashCode());
		System.out.println("Hashode 2  : " + el.hashCode());
	}
}