package problems.bonus;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem?isFullScreen=true">GCD</a>
 */
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read user input
        // Base parameters
        int a = sc.nextInt();
        int b = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println(GCD(a, b));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns GCD of both specified parameters. <br>
     * Runs in O(log n) complexity.
     * @param a Specified parameter.
     * @param b Specified parameter.
     * @return GCD of both parameters.
     */
    public static int GCD(int a, int b) {
        // Special cases
        if (a == 0 && b == 0) {
            return 0;
        } else if (a == 0) {
            return Math.abs(b);
        } else if (b == 0) {
            return Math.abs(a);
        }

        // Base case
        if (a % b == 0) {
            return Math.abs(b);
        }

        return GCD(b, a % b);
    }
}
