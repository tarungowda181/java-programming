import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore swapping: a = " + a + ", b = " + b);

        // Method 1: using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (temp variable): a = " + a + ", b = " + b);

        // Swap back so the next method starts from the original values
        temp = a;
        a = b;
        b = temp;

        // Method 2: without a temporary variable (using + and -)
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);

        sc.close();
    }
}