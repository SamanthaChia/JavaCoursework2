// Name: Samantha Chia Eileen 
// Student Number: 190428594
// Course Number : CO1109
// Coursework 2

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBooksParser{

    private AudioBooksParser(){}

    public static List<AudioBook> parseAudioBookFile(String filename){
        Scanner in = getScanner(filename);
		if(in == null) {
			return null;
		}
        List<AudioBook> audioBooks = new ArrayList<AudioBook>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            AudioBook aBook = parseAudioBook(line);
            audioBooks.add(aBook);
        }
        in.close();
        return audioBooks;
    }

    private static Scanner getScanner(String filename) {
		Scanner in = null;
		
		try {
			in = new Scanner(new FileInputStream(filename), "UTF-8");
		} catch (IOException e) {
			System.err.println("File "+filename+" does not exist.");
			return null;
		} 
		//two non-book lines to skip:
		in.nextLine();
		in.nextLine();
		
		return in;
    }

    private static AudioBook parseAudioBook(String line){
        //Split the text and trim access space.
        String[] data = PrintBooksParser.splitTrimArrayFromText(line);

        String author = data[0];
        String title = data[1];
        String genre = data[2];
        String publisher = data[3];
        String asin = data[5];
        String narrator = data[6];
        int yearOfPub = Integer.parseInt(data[4]);
        int totalSales = Integer.parseInt(data[8]);
        // create Duration for AudioBook
        Duration listenTime = parseDuration(data);
        

        AudioBook ab = new AudioBook(author, title, genre, publisher, yearOfPub, asin, narrator, listenTime);
        ab.setSales(totalSales);
        
        return ab;
    }

    private static Duration parseDuration(String[] data){
        String[] timeData = data[7].split(" ");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[3]);
        Duration listenTime = new Duration(hours, minutes);

        return listenTime;
    }

	public static void display(List<AudioBook> aBooks){
		for(AudioBook ab : aBooks){
            System.out.println(ab);
        }
	}
}