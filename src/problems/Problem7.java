package problems;

import java.util.Scanner;

public class Problem7 {
    public static void start() {
        Scanner sc = new Scanner(System.in); // Initializing Scanner to read user input
        System.out.println("Enter the number of elements you wish to reverse input");
        int n = sc.nextInt(); // Base parameter n

        // Since the time is based on users input speed,
        // I didn't include time calculation for this problem

        reverseInput(sc, n);
    }

    /**
     * Reads inputs, reverses them, and prints them. <br>
     * Runs in O(n) complexity.
     * @param sc Scanner to read input from console.
     * @param n Number of inputs to read.
     */
    public static void reverseInput(Scanner sc, int n) {
        System.out.println("Enter your element");
        String input = sc.next();
        if (n == 1) {
            System.out.println(input);
            return;
        }

        reverseInput(sc, n - 1);
        System.out.println(input);
    }
}
