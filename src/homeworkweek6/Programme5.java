package homeworkweek6;
/* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/

public class Programme5 {
    public static void main(String[] args) {
       Programme5 cal = new Programme5();
       cal.addition(2,4);
       cal.subtraction(4,2);
      multiplication(4,6);
      division(2,8);
    }
public void addition(int a , int b){    //instance method
        int ans = a + b;

    System.out.println("addition of two numbers "+ ans);
}
public void subtraction(int a, int b){     //instance method
        int ans = a - b;
    System.out.println("subtraction of two number " + ans);
}
public static void multiplication( int a, int b){
           int ans = a * b;
    System.out.println("multiplication of two number "+ ans);
}
public static void division(int a, int b){
        int ans = b/a;
    System.out.println("division of two number " + ans);
}



}
