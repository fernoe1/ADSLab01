package problems.bonus;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem?isFullScreen=true">Fibonacci Numbers</a>
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing scanner to read user input
        int n = sc.nextInt(); // Base parameter n

        double startTime = System.nanoTime();
        System.out.println(fibonacci(n));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns n-th element of an Fibonacci sequence. <br>
     * Runs in O(2<sup>n</sup>) complexity.
     * @param n The position of an element in Fibonacci sequence.
     * @return The element at the inputted position in Fibonacci sequence.
     * @throws IllegalArgumentException if elements at negative positions are accessed.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Trying to find element of an sequence at negative position");
        }

        if (n == 1 || n == 0) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
