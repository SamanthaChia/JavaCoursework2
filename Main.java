import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
		PrintBooksParser.display(pBooks);
		
		System.out.println();
		System.out.println("/****************************************************/");
		System.out.println();
		
		// List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		// AudioBooksParser.display(aBooks);
	}
}
