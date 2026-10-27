import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Method 1: using a for loop (read characters from the end)
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed (loop): " + reversed);

        // Method 2: using StringBuilder's built-in reverse()
        String reversed2 = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversed2);

        sc.close();
    }
}