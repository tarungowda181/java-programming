import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Method 1: using a normal for loop (gives access to the index)
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Method 2: using an enhanced for loop (for-each)
        System.out.print("\nUsing for-each loop: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Method 3: using Arrays.toString()
        System.out.println("\nUsing Arrays.toString(): " + Arrays.toString(arr));

        sc.close();
    }
}