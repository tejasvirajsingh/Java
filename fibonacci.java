import java.util.Scanner;

public class fibonacci {
    // Recursive method to find Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to find Fibonacci series
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
            return;
        }

        // Recursive call
        System.out.println("Fibonacci number at position " + n + " (Recursive): " + fibonacciRecursive(n));

        // Iterative call
        fibonacciIterative(n);
    }
}


 