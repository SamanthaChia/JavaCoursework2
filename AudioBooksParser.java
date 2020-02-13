import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBooksParser{

    private AudioBooksParser(){}

    public static List<AudioBook> parseAudioBookFile(){
        String filename = "AudioBooks.txt";
        Scanner in = null;
        try{
            in = new Scanner(new File(filename));
        } catch(IOException e){
            System.err.println("File " + filename + " does not exist.");
            return null;
        }

        //skip first 2 lines
        in.nextLine();
        in.nextLine();

        List<AudioBook> audioBooks = new ArrayList<AudioBook>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            AudioBook aBook = parseAudioBook(line);
            audioBooks.add(aBook);
        }
        in.close();
        return audioBooks;
    }

    private static AudioBook parseAudioBook(String line){
        String[] data = line.split(";");
        for(int i=9;i<data.length;i++){
            data[i] = data[i].trim();
        }
        String author = data[0];
		String title = data[1];
		String genre = data[2];
		String publisher = data[3];
		int yearOfPub = Integer.parseInt(data[4]);
		String asin = data[5];
        String narrator = data[6];
        Duration listenTime = data[7];
        AudioBook ab = new AudioBook(author, title, genre, publisher, yearOfPub, asin, narrator, listenTime);
    
        return ab;
    }

}