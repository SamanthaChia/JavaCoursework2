// Name: Samantha Chia Eileen 
// Student Number: 190428594
// Course Number : CO1109
// Coursework 2

import java.util.List;

public class Main {

	//Tested and works like how I had expected it to. 
	public static void main(String[] args) {
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
		PrintBooksParser.display(pBooks);
		
		System.out.println();
		System.out.println("/****************************************************/");
		System.out.println();
		
		List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		AudioBooksParser.display(aBooks);
	}
}
