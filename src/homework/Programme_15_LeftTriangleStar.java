package homework;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void leftTrangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = scanner.nextInt();
        leftTrangle(a);
        // closing the scanner object
        scanner.close();
    }

}
