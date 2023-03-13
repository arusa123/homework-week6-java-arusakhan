package homeworkweek6;
/**
 * Write a Java program to swap two variables.*/

public class Programme15 {
 public void variables(){
     int a = 15;
     int b = 20;
     int c = a;
     a = b;
     b = c;
     System.out.println(a);
     System.out.println(b);
 }

    public static void main(String[] args) {
        Programme15 prog = new Programme15();
        prog.variables();
    }




}
