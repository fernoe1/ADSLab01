package problems.bonus;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * <a href="https://www.hackerrank.com/challenges/filter-elements/problem?isFullScreen=true">Filter Elements</a>
 */
public class FilterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        // Base parameters
        int t = sc.nextInt();
        int[][] arrays = new int[t][];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            arrays[i] = new int[n + 1];
            arrays[i][0] = k; // Putting k as the first element.
            for (int j = 1; j < n + 1; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        double startTime = System.nanoTime();
        for (int i = 0; i < t; i++) {
            filterElements(arrays[i]);
        }
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Filters elements from an array, only printing out elements that occurred at least k times. <br>
     * Runs in O(n) complexity.
     * @param arr The array to filter.
     */
    public static void filterElements(int[] arr) {
        int count = arr[0];
        filterElements(arr, new ArrayList<>(), count, false, 1);
        System.out.println();
    }

    /**
     * Helper function.
     * @param arr The array to filter.
     * @param usedNumbers Used numbers.
     * @param count How many times a number at least should occur.
     * @param flag Flag used to determine if there was a number that fit the criteria or not.
     * @param index Current index.
     */
    public static void filterElements(int[] arr, ArrayList<Integer> usedNumbers, int count, boolean flag, int index) {
        if (index == arr.length) {
            if (!flag) {
                System.out.print(-1);
            }

            return;
        }

        int currentNumber = arr[index];
        if (!usedNumbers.contains(currentNumber)) {
            usedNumbers.add(currentNumber);

            int occurrence = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == currentNumber) {
                    occurrence++;
                }
            }

            if (occurrence >= count) {
                System.out.print(currentNumber + " ");
                flag = true;
            }

            filterElements(arr, usedNumbers, count, flag, index + 1);
        } else {
            filterElements(arr, usedNumbers, count, flag, index + 1);
        }
    }
}
