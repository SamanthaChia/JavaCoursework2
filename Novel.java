// Name: Samantha Chia Eileen 
// Student Number: 190428594
// Course Number : CO1109
// Coursework 2

public class Novel {
	private String author;
	private String title;
	private String genre;
	
	public Novel(String author, String title, String genre) {
		this.author = author;
		this.title = title;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}	
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String toString() {
		String s = String.format("Author: %s%n", author);
		s += String.format("Title: %s%n", title);
		s += String.format("Genre: %s%n", genre);
		return s;
	}     
		
	public static void main(String[] args) {
		//test statements	
		Novel novel = new Novel("J Smith", "Some title", "Horror");
		System.out.println(novel.getAuthor());
	}	
}
