public class AudioBook extends PublishedBook {
    private String asn;
    private String narrator;
    private Duration listenTime;

    public AudioBook(String author, String title, String genre, String publisher, int yearOfPub, String asn, String narrator, Duration listenTime) {
		super(author, title, genre, publisher, yearOfPub);
		this.asn = asn;
        this.narrator = narrator;
        this.listenTime = listenTime;
    }
    
}