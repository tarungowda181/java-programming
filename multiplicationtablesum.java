import java.util.Scanner;

public class multiplicationtablesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Print multiplication table and calculate sum
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
            sum += product;
        }

        // Print the sum of all products
        System.out.println("Sum of all multiplications: " + sum);

        sc.close();
    }
}