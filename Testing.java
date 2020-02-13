import java.util.*;

public class Testing {
	public static void main(String[] args) {
        String testString = "This;is;a;String;";
        // System.out.println(testString);
        
        // String[] words = testString.split(";");
        // System.out.println(words);
        
        // String wordsAgain = Arrays.toString(words);
        // System.out.println(wordsAgain);
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : testString.split(";"))
            joiner.add(word);
        System.out.println(joiner.toString());
	}
}
