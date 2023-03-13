package homeworkweek6;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Programme18 {

    static int a = 125;
    static int b = 24;
    //static int ans = a + b;

    public static void addition() {
        int ans = a + b;
        System.out.println(a + " + " + b + " = " + ans);
    }

    public static void subtraction() {
        int ans = a - b;
        System.out.println(a + " - " + b + " = " + ans);
    }

    public static void multiplication() {
        int ans = a * b;
        System.out.println(a + " * " + b + " = " + ans);
    }

    public static void division() {
        int ans = a / b;
        System.out.println(a + " / " + b + " = " + ans);
    }

    public static void mod() {
        int ans = a % b;
        System.out.println(a + " mod " + b + " = " + ans);
    }

    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
        mod();


    }

}
