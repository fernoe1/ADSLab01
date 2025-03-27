package problems.bonus;

import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/sequence-full-of-colors/problem?isFullScreen=true">Sequence Full Of Colors</a>
 */
public class SequenceFullOfColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(isSequenceFullOfColors(strings[i]));
        }
    }

    /**
     * Returns <b>true</b> if sequence is full of colors, <b>false</b> otherwise. <br>
     * Runs in O(n) complexity.
     * @param s The string to check.
     * @return <b>True</b> if sequence is full of colors, <b>false</b> otherwise.
     */
    public static boolean isSequenceFullOfColors(String s) {
        return isSequenceFullOfColors(s, 0, 0, 0, 0, 0);
    }

    /**
     * Helper function.
     * @param s The string to check.
     * @param rCount Red ball count.
     * @param gCount Green ball count.
     * @param yCount Yellow ball count.
     * @param bCount Blue ball count.
     * @param index Current index.
     * @return <b>True</b> if sequence is full of colors, <b>false</b> otherwise.
     */
    public static boolean isSequenceFullOfColors(String s, int rCount, int gCount, int yCount, int bCount, int index) {
        if (index == s.length()) {
            return rCount == gCount && yCount == bCount;
        }

        char c = s.charAt(index);
        if (c == 'R') {
            rCount++;
        } else if (c == 'G') {
            gCount++;
        } else if (c == 'Y') {
            yCount++;
        } else if (c == 'B') {
            bCount++;
        }

        if (Math.abs(rCount - gCount) > 1 || Math.abs(yCount - bCount) > 1) {
            return false;
        }

        return isSequenceFullOfColors(s, rCount, gCount, yCount, bCount, index + 1);
    }
}
