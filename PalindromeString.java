import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Ignore case so "Madam" is treated as a palindrome
        String clean = str.toLowerCase();

        int left = 0;
        int right = clean.length() - 1;
        boolean isPalindrome = true;

        // Compare characters from both ends moving towards the middle
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }

        sc.close();
    }
}