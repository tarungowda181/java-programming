import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase so 'A' and 'a' are treated the same
        String lower = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    // not a vowel, do nothing
            }
        }

        System.out.println("Number of vowels: " + count);

        sc.close();
    }
}