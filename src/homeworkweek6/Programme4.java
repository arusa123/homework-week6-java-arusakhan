package homeworkweek6;
/*Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */

public class Programme4 {
    int a = 5;
    int b = 10;
    static int d = 4;
    static int e = 6;

    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);


    }

    public static void myMethod() {
        Programme4 meth = new Programme4();
        System.out.println(meth.a);
        System.out.println(meth.b);
        System.out.println(d);
        System.out.println(e);
    }

        public static void main(String [] args){
            Programme4 obj = new Programme4();
            obj.instanceMethod();
            myMethod();


        }


    }