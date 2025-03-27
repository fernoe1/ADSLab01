package problems;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read user input
        // Base parameters
        int a = sc.nextInt();
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println(powerOfAOverN(a, n));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns power of <b>a</b> over <b>n</b>. <br>
     * Runs in O(n) complexity.
     * @param a Base.
     * @param n Exponent.
     * @return <b>n</b> over <b>a</b>.
     */
    public static int powerOfAOverN(int a, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return a;
        }

        return a * powerOfAOverN(a, n - 1);
    }
}
