package homeworkweek6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Programme13 {

    public static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("The average is:" + avg);

        scanner.close();

    }

    public static void main(String[] args) {
        myMethod();

    }


}
