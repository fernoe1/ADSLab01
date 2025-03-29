package problems;

import java.util.Scanner;

public class Problem4 {
    public static void start() {
        Scanner sc = new Scanner(System.in); // Initializing scanner to read user input
        System.out.println("Enter the number to find the factorial of");
        int n = sc.nextInt(); // Base parameter n

        double startTime = System.nanoTime();
        System.out.println(factorial(n));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }


    /**
     * Returns factorial of the number. <br>
     * Runs in O(n) complexity.
     * @param n The number you want to find the factorial of.
     * @return The factorial of the number.
     * @throws IllegalArgumentException if the number is negative.
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number");
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
