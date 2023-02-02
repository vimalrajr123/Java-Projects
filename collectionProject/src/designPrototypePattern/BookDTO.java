package designPrototypePattern;

public class BookDTO {
	
	private int bookId;
	private String bookName;

	/**
	 * @param bookId
	 * @param bookName
	 */
	public BookDTO(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
	
	
	
	

}
