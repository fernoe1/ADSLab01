package problems.bonus;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/string-compression/problem?isFullScreen=true">String Compression</a>
 */
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        String s = sc.next(); // Base parameter s

        double startTime = System.nanoTime();
        System.out.println(compress(s));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Compresses string, if concisely aaaa becomes a3. <br>
     * Runs in O(n) complexity.
     * @param s String to compress.
     * @return Compressed string.
     */
    public static String compress(String s) {
        return s.charAt(0) + compress(s, s.charAt(0), 1, 0);
    }

    /**
     * Helper function.
     * @param s String to compress.
     * @param currentChar Current character.
     * @param index Current index.
     * @param counter Counts consecutive characters.
     * @return Compressed string.
     */
    public static String compress(String s, char currentChar, int index, int counter) {
        if (index == s.length()) {
            return counter > 1 ? "" + counter : "";
        }

        if (s.charAt(index) == currentChar) {
            return compress(s, currentChar, index + 1, counter + 1);
        } else {
            String result = counter > 1 ? "" + counter + s.charAt(index): "" + s.charAt(index);
            return result + compress(s, s.charAt(index), index + 1, 1);
        }
    }
}
