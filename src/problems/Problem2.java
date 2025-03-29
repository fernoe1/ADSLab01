package problems;

import java.util.Scanner;

public class Problem2 {
    public static void start() {
        Scanner sc = new Scanner(System.in); // Initializing scanner to read input
        // Base parameter n and array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array");
        /* Filling the array.
           The speed is actually based on the users input,
           but if the input was instantly given, it runs in O(n) complexity. */
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        System.out.println(findAverageOfArray(arr));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns the average of an array. <br>
     * Runs in O(n) complexity, if concisely O(n-1) + 1.
     * @param arr The array you want to find average from.
     * @return The average of an array.
     * @throws IllegalArgumentException if the array is empty.
     */
    public static double findAverageOfArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }

        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }
}
