import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reversed = 0;

        // Handle negative numbers by working with the absolute value
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }

        while (number != 0) {
            int digit = number % 10;          // get the last digit
            reversed = reversed * 10 + digit; // append it to the reversed number
            number = number / 10;             // remove the last digit
        }

        if (isNegative) {
            reversed = -reversed;
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}