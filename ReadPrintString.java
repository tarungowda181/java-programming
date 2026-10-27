import java.util.Scanner;

public class ReadPrintString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a single word (stops at the first space)
        System.out.print("Enter a word: ");
        String word = sc.next();
        sc.nextLine(); // consume the leftover newline

        // Read a full line (including spaces)
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("\nWord entered: " + word);
        System.out.println("Sentence entered: " + sentence);

        sc.close();
    }
}