package homeworkweek6;
/* Write a Java program to compute the specified expressions and print the  output.
Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
*/
public class Programme12 {

    public void expression(){
    double a = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println("Expected output: " + a);
    }

    public static void main(String[] args) {
        Programme12 programme12 = new Programme12();
        programme12.expression();
    }


}
