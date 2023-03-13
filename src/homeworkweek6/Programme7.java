package homeworkweek6;
/* Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius
((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7 {

    static double f;


    public static void fahrenheit(){
        double c = ((f - 32)*5/9);            //calculating the formula and storing the value in a variable
        System.out.println("Fahrenheit to Celsius is " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit ");
        f = scanner.nextDouble();
        fahrenheit();
        scanner.close();
    }

}
