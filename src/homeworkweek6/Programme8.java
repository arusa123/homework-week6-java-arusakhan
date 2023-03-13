package homeworkweek6;
/*  Write a program to calculate the area of a triangle. */
import java.util.Scanner;

public class Programme8 {

    static double h;
    static double b;

    public static void triangle(){
        double area = (h*b*1/2);
        System.out.println("Area of a triangle is" + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of a triangle ");
        h = scanner.nextDouble();
        System.out.println("Enter the base of a triangle ");
        b = scanner.nextDouble();
        triangle();
        scanner.close();
    }
}
