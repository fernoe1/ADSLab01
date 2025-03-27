package problems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initializing scanner to read input
        // Base parameter n and array
        int n = sc.nextInt();
        int[] arr = new int[n];
        /* Filling the array.
           The speed is actually based on the users input,
           but if the input was instantly given, it runs in O(n) complexity. */
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        System.out.println(findMin(arr));
        double endTime = System.nanoTime();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Returns the minimum element of an array. <br>
     * Runs in O(n) complexity, if concisely O(n-1).
     * @param arr The array you want to find the min element from.
     * @return Min element of the array.
     * @throws IllegalArgumentException if the array is empty.
     */
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
