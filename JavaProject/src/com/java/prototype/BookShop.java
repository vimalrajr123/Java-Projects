package com.java.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	


	private String bookName;
	private List<Book> books = new ArrayList<>();
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	public void loadDataSource() {
		
		for(int i=1;i<6;i++) {
			Book b = new Book();
			b.setId(i);
			b.setName("Book - " + i);
			getBooks().add(b);
		}
	}
	
	@Override
protected BookShop clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
		
		BookShop shop = new BookShop();
		
		
		for(Book b : this.getBooks()) {
			
			shop.getBooks().add(b);
		}
		
	return shop;
}
	
	
	@Override
	public String toString() {
		return "BookShop [bookName=" + bookName + ", books=" + books + "]";
	}
	
	
	

}
