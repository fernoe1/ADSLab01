package problems.bonus;

import java.util.Scanner;

public class StringMingling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        // Base parameters
        String p = sc.next();
        String q = sc.next();

        double startTime = System.nanoTime();
        System.out.println(stringMingle(p, q));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Mingles two strings of equal length in a p1q1p2q2...pnqn format. <br>
     * Runs in O(n) complexity.
     * @param p First string.
     * @param q Second string.
     * @throws IllegalArgumentException if the strings don't share equal length.
     * @return Mingled string.
     */
    public static String stringMingle(String p, String q) {
        if (p.length() != q.length()) {
            throw new IllegalArgumentException("Two strings don't share equal length");
        }
        return "" + p.charAt(0) + q.charAt(0) + stringMingle(p, q, 1);
    }

    /**
     * Helper function. <br>
     * @param p First string.
     * @param q Second string.
     * @param index Current character index.
     * @return Mingled string.
     */
    public static String stringMingle(String p, String q, int index) {
        if (index == p.length()) {
            return "";
        }

        return "" + p.charAt(index) + q.charAt(index) + stringMingle(p, q, index + 1);
    }
}
