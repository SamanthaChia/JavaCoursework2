import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBooksParser{

    private AudioBooksParser(){}

    private static Scanner getScanner(String filename){
        Scanner in = null;

        try{
            in = new Scanner(new FileInputStream(filename), "UTF-8");
        } catch(IOException e){
            System.err.println("File " + filename + " does not exist.");
            return null;
        }
        in.nextLine();
        in.nextLine();

        return in;
    }

}