import problems.*;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        start(new Scanner(System.in)); // Starting the project
    }

    public static void start(Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("Choice a problem between 1 and 10, if you wish to exit input 0");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting problem 1..");
                    Problem1.start();
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Starting problem 2..");
                    Problem2.start();
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("Starting problem 3..");
                    Problem3.start();
                    System.out.println("------------------------------");
                    break;
                case 4:
                    System.out.println("Starting problem 4..");
                    Problem4.start();
                    System.out.println("------------------------------");
                    break;
                case 5:
                    System.out.println("Starting problem 5..");
                    Problem5.start();
                    System.out.println("------------------------------");
                    break;
                case 6:
                    System.out.println("Starting problem 6..");
                    Problem6.start();
                    System.out.println("------------------------------");
                    break;
                case 7:
                    System.out.println("Starting problem 7..");
                    Problem7.start();
                    System.out.println("------------------------------");
                    break;
                case 8:
                    System.out.println("Starting problem 8..");
                    Problem8.start();
                    System.out.println("------------------------------");
                    break;
                case 9:
                    System.out.println("Starting problem 9..");
                    Problem9.start();
                    System.out.println("------------------------------");
                    break;
                case 10:
                    System.out.println("Starting problem 10..");
                    Problem10.start();
                    System.out.println("------------------------------");
                    break;
                case 0:
                    flag = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}