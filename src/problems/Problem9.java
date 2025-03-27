package problems;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read user input
        // Base parameters
        int n = sc.nextInt();
        int k = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println(binomialCoefficient(n, k));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }


    /**
     * Returns binomial coefficient at specified <b>n</b> and <b>k</b>. <br>
     * Runs in O(2<sup>n</sup>) complexity.
     * @param n Specified parameter.
     * @param k Specified parameter.
     * @return Binomial coefficient at specified parameters.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k < 0 || n < 0) {
            throw new IllegalArgumentException("Negative binomial coefficient parameters");
        }

        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
