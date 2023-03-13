package homeworkweek6;

public class Programme16 {


    public static void binaryAddition() {
        String b1 = "10";
        String b2 = "11";
        int a = Integer.parseInt(b1,2);
        int b = Integer.parseInt(b2,2);
        int sum = (a+b);
        String bsum = Integer.toBinaryString(sum);
        System.out.println(b1 + "+" + b2  + " = " + bsum);
    }

    public static void main(String[] args) {
        binaryAddition();
    }

    }
