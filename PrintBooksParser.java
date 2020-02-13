import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintBooksParser {
	
	private PrintBooksParser(){
		
	}

	public static List<PrintBook> parsePrintBookFile(String filename) {
		Scanner in = getScanner(filename);
		if(in == null) {
			return null;
		}
		List<PrintBook> printBooks = new ArrayList<PrintBook>();
		while(in.hasNextLine()) {
			String line = in.nextLine();
			PrintBook pBook = parsePrintBook(line);
			printBooks.add(pBook);
		}
		in.close();
		return printBooks;
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

	private static PrintBook parsePrintBook(String line){
		//statements missing
		line = line.trim(); //remove extra space
		String[] data = line.split(";"); //split the words
		String author = data[0];
		String title = data[1];
		String genre = data[2];
		String publisher = data[3];
		int yearOfPub = Integer.parseInt(data[4]);
		String isbn = data[5];
		int noOfPages = Integer.parseInt(data[6]);
		PrintBook pb = new PrintBook(author, title, genre, publisher, yearOfPub, isbn, noOfPages);
		
		return pb;
	}
	
	public static void display(List<PrintBook> pBooks){
		for(PrintBook pb : pBooks)
		System.out.println(pb);
	}
		
	public static void main(String[] args) {
		//main for testing this class
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
		display(pBooks);
	}
}
