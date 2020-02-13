public class AudioBook extends PublishedBook {
    private String asin;
    private String narrator;
    private Duration listenTime;

    public AudioBook(String author, String title, String genre, String publisher, int yearOfPub, String asin, String narrator, Duration listenTime) {
		super(author, title, genre, publisher, yearOfPub);
		this.asin = asin;
        this.narrator = narrator;
        this.listenTime = listenTime;
    }
    
    public String getAsin(){
        return asin;
    }

    public String getNarrator(){
        return narrator;
    }

    public Duration getListenTime(){
        return listenTime;
    }

    public String toString(){
        String s = super.toString();
		s += String.format("ASIN: %s%n", asin);
        s += String.format("Narrator: %s%n", narrator);
        s += String.format("Listen Time: %s%n", listenTime);
		return s;
    }
}