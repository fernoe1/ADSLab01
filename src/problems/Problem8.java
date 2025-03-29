package problems;

import java.util.Scanner;

public class Problem8 {
    public static void start() {
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read user input
        System.out.println("Enter the string you want to check if it only consists of numbers or not");
        String s = sc.next(); // Base parameter s

        double startTime = System.nanoTime();
        consistsOfDigits(s);
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * This is a convenience method that sets up every other parameter for main consistOfDigits function. <br>
     * Runs in O(1) complexity.
     * @param s The string you want to check if it consists of numbers fully.
     */
    public static void consistsOfDigits(String s) {
        consistsOfDigits(s, true, s.length() - 1);
    }

    /**
     * Prints <b>Yes</b> or <b>No</b> based on if a string contains only numbers or not. <br>
     * Runs in O(n) complexity.
     * @param s The string that is being checked.
     * @param flag Helper parameter.
     * @param n Length of the string.
     */
    public static void consistsOfDigits(String s, boolean flag, int n) {
        if (n == -1) {
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            return;
        }

        if (!('0' <= s.charAt(n) && s.charAt(n) <= '9')) {
            flag = false;
        }

        consistsOfDigits(s, flag, n - 1);
    }
}
