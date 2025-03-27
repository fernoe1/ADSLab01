package problems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing scanner to read user input
        int n = sc.nextInt(); // Base parameter n

        double startTime = System.nanoTime();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns either <b>true</b> or <b>false</b> based on the parameter. <br>
     * Runs in O(√n) complexity, if concisely O(√n) - 2.
     * @param n The number to determine if its prime or composite.
     * @return True or false.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {

            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
