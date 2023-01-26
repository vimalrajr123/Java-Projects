package com.java.prototype;

public class ProtoTypeClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop b = new BookShop();
		b.setBookName("Java");
		b.loadDataSource();
		
		
		BookShop b1 = b.clone();
		b1.setBookName("C++");
		b.getBooks().remove(0);
		
		System.out.println(b);
		System.out.println(b1);

	}

}
