import java.util.List;
import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBook123s.txt");
		while(pBooks == null){
			Scanner kb = new Scanner(System.in);
			System.out.print("File doesn't exist, please enter a valid file name : ");
			String filename = kb.nextLine();
			pBooks = PrintBooksParser.parsePrintBookFile(filename);
		}
		PrintBooksParser.display(pBooks);
		
		System.out.println();
		System.out.println("/****************************************************/");
		System.out.println();
		
		List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		AudioBooksParser.display(aBooks);
	}
}