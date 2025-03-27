package problems.bonus;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReductions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        String s = sc.next(); // Base parameter s

        double startTime = System.nanoTime();
        System.out.println(reduceString(s));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Reduces strings, making each symbol only appear once. <br>
     * Runs in O(n) complexity.
     * @param s String you want to reduce.
     * @return Reduced string.
     */
    public static String reduceString(String s) {
        char currentChar = s.charAt(0);
        ArrayList<Character> usedChars = new ArrayList<>();
        usedChars.add(currentChar);
        return currentChar + reduceString(s, usedChars, 1);
    }

    /**
     * Helper function.
     * @param s String you want to reduce.
     * @param usedChars Used characters.
     * @param index Current index.
     * @return Reduced string.
     */
    public static String reduceString(String s, ArrayList<Character> usedChars, int index) {
        if (index == s.length()) {
            return "";
        } else if (usedChars.contains(s.charAt(index))) {
            return reduceString(s, usedChars, index + 1);
        } else {
            usedChars.add(s.charAt(index));
            return s.charAt(index) + reduceString(s, usedChars, index + 1);
        }
    }
}
