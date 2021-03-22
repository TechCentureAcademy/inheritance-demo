package session4;

// Book is a child of Object 
public class Book  {

	
	private String author;
	private String title;
	private long numPages;
	private String isbn;
	private double price;
	

	public Book(String author, String title, long numPages, String isbn, double price) {
		super();
		this.author = author;
		this.title = title;
		this.numPages = numPages;
		this.isbn = isbn;
		this.price = price;
	}

	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + ", isbn=" + isbn + ", price="
				+ price + "]";
	}

}

 class Novel extends Book{

	 
	public Novel(String author, String title, long numPages, String isbn, double price) {
		super(author, title, numPages, isbn, price);
		
	}
	
}

 
 class GoodNovel extends Novel{

	public GoodNovel(String author, String title, long numPages, String isbn, double price) {
		super(author, title, numPages, isbn, price);
		// TODO Auto-generated constructor stub
	}
	 
 }
 
class ChildGoodNovel extends GoodNovel{

	public ChildGoodNovel(String author, String title, long numPages, String isbn, double price) {
		super(author, title, numPages, isbn, price);
		// TODO Auto-generated constructor stub
	}
	
}




