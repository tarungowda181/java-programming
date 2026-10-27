import java.util.Scanner;

public class MatrixOperations {

    // Read a matrix of given size from the user
    static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    // Print a matrix
    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Matrix addition: both matrices must have the same dimensions
    static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // Matrix multiplication: columns of A must equal rows of B
    static int[][] multiply(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;
        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter elements of Matrix A:");
        int[][] a = readMatrix(sc, r1, c1);

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter elements of Matrix B:");
        int[][] b = readMatrix(sc, r2, c2);

        // Addition
        System.out.println("\n=== Matrix Addition (A + B) ===");
        if (r1 == r2 && c1 == c2) {
            printMatrix(add(a, b));
        } else {
            System.out.println("Addition not possible: matrices must have the same size.");
        }

        // Multiplication
        System.out.println("\n=== Matrix Multiplication (A x B) ===");
        if (c1 == r2) {
            printMatrix(multiply(a, b));
        } else {
            System.out.println("Multiplication not possible: columns of A must equal rows of B.");
        }

        sc.close();
    }
}