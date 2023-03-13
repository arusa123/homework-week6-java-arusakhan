package homeworkweek6;
/** Write a Java program to convert a decimal number to binary number.

* Input Data:
* Input a Decimal Number : 5
* Expected Output

 * Binary number is: 101*/

public class Programme17 {


    public static void binaryNumber(){
        int a = 5;
        String b = Integer.toBinaryString(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        binaryNumber();
    }



}
