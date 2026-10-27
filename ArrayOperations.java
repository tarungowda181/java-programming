import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Accept 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Process the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            sum += arr[i];

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / arr.length;

        // Print results
        System.out.println("\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);

        sc.close();
    }
}