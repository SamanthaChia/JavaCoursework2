import java.util.List;

public class MainTwo {

	public static void main(String[] args) {
		// !!!! not done yet.
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
		PrintBooksParser.display(pBooks);
		
		System.out.println();
		System.out.println("/****************************************************/");
		System.out.println();
		
		List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		AudioBooksParser.display(aBooks);
	}
}
