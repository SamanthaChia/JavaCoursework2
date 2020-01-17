public class PrintBook extends PublishedBook {
	private String isbn;
	private int noOfPages;
	
	public PrintBook(String author, String title, String genre, String publisher, int yearOfPub, String isbn, int noOfPages) {
		super(author, title, genre, publisher, yearOfPub);
		this.isbn = isbn;
		this.noOfPages = noOfPages;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public int getNoOfPages() {
		return noOfPages;
	}
	
	public String toString() {
		String s = super.toString();
		s += String.format("ISBN: %s%n", isbn);
		s += String.format("Number of pages: %d%n", noOfPages);
		return s;
	}	
}
