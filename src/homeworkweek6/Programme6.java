package homeworkweek6;

import java.util.Scanner;

/* Write a program to enter any radius value of the circle and find out the  area.
(Formula of Area A=PI*r*r).*/
public class Programme6 {

    static double r;            //declaring static variable of double type data


     public void radius(){           //instance method to calculate the radius
         double a = (Math.PI*r*r);
         System.out.println("Area of a circle is " + a);
     }

    public static void main(String[] args) {
         //creating object of the class
        Programme6 rad = new Programme6();
        // creating the object of the scanner class
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter radius of the circle: ");
       //this will take the value of double type as input
        r = scanner.nextDouble();
        //calling instance method via object
        rad.radius();
        scanner.close();
    }




}
