// Name: Samantha Chia Eileen 
// Student Number: 190428594
// Course Number : CO1109
// Coursework 2

public class PublishedBook extends Novel {
	private String publisher;
	private int yearOfPub;
	private int sales;
	
	public PublishedBook(String author, String title, String genre, String publisher, int yearOfPub) {
		super(author, title, genre);
		this.publisher = publisher;
		this.yearOfPub = yearOfPub;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public int getYearOfPub() {
		return yearOfPub;
	}
	
	public int getSales() {
		return sales;
	}
	
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public String toString() {
		String s = super.toString();
		s += String.format("Publisher: %s%n", publisher);
		s += String.format("Year of publication: %d%n", yearOfPub);
		s += String.format("Sales to date: %d%n", sales);
		return s;
	}
}
