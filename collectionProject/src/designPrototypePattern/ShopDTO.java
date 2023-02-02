package designPrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ShopDTO implements Cloneable {
	
	private int shopId;
	private String shopName;
	private List<BookDTO> book;
	
	/**
	 * 
	 */
	public ShopDTO() {
		super();
	}
	
	public ShopDTO(int shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.book= call();
		
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<BookDTO> getBook() {
		return book;
	}
	public void setBook(List<BookDTO> book) {
		this.book = book;
	}
	
	public List<BookDTO> call() {
		BookDTO b1 = new BookDTO(101, "book1");
		BookDTO b2 = new BookDTO(102, "book2");
		BookDTO b3 = new BookDTO(103, "book3");
		BookDTO b4 = new BookDTO(104, "book4");
		List<BookDTO> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		return bookList;
	}
	
	@Override
	public String toString() {
		return "ShopDTO [shopId=" + shopId + ", shopName=" + shopName + ", book=" + book + "]";
	}
	
	@Override
	protected ShopDTO clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ShopDTO s =new ShopDTO();
		s.setBook(call());
		return s;
	}
	
	
	
	
}
