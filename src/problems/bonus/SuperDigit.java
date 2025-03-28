package problems.bonus;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/super-digit/problem?isFullScreen=true">Super Digit</a>
 */
public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        // Base parameters
        int n = sc.nextInt();
        int k = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println(superDigit("" + n * k));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns <b>Super Digit</b>. <br>
     * Runs in O(log base 10 n) complexity.
     * @param s String to get <b>Super Digit</b> from.
     * @throws IllegalArgumentException if the string does not consist only from numbers.
     * @return <b>Super Digit</b>.
     */
    public static int superDigit(String s) {
        if (!isNumeric(s)) {
            throw new IllegalArgumentException("Input contains letters");
        }
        if (s.length() == 1) {
            return s.charAt(0) - '0';
        }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return superDigit("" + sum);
    }

    /**
     * Returns true if string only consists of numbers, false if not. <br>
     * Runs in O(n) complexity.
     * @param s The string to check.
     * @return <b>True</b> or <b>false</b>.
     */
    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {

                return false;
            }
        }

        return true;
    }
}
