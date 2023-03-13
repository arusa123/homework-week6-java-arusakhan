package homeworkweek6;
/* Write a Java program to print the area and perimeter of a rectangle. Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

public class Programme14 {

public static void rectangle(){
    double width = 5.6;
    double height = 8.5;
    float area  = (float) (width*height);
    System.out.println("Area of rectangle is " + area);
    double perimeter = 2*(width + height);
    System.out.println("Perimeter of rectangle is " + perimeter);
}

    public static void main(String[] args) {
        rectangle();

    }

}
