import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        //Declare a variable;
        byte age;

        //initialize the variable;

        age = 31;
        //Declare and initialize in the same line
        String myName = "Joshua";

        //You cannot use an uninitialized variable in Java;
        System.out.println("My name is " + myName + "," + " and I am " + age + " Years old!");

        //Primitive Types
        /*Type          Bytes           Range
        * byte          1               [-128, 127]
        * int           4               [-2B, 2B]
        *long           8               [-9Q, 9Q]
        *float          4               [7 numbers after decimal]
        * double        8               [16 numbers after decimal]
        * char          2               [A, B, C, .....]
        * boolean       1               [ture/false]
        *
        * */

        long viewsCount = 3_123_456_789L; //You can use an underscore to separate values
                                            //You need to add an L as the suffix of long numbers
        //storing a number with a decimal point
        //Double is used for up to 16 digits passed the decimal
        //Float is used for up to 7 digits passed the decimal
        float price = 10.99F;
        char letter = 'J'; //char represents only one character
        boolean isEligible = false;
        //In order to use the Date class, Java has to import the class
        //As seen at the top;
        Date now = new Date();
        //An Object is an instance of a class
        System.out.println("The time is now: " + now);

        //Working with variables

        byte x = 1;
        byte y = x;

        System.out.print("x = " + x + " y = " + y + "\n");
        x = 2;
        System.out.print("x = " + x + " y = " + y + "\n");

        Point point1 = new Point(1, 1);
        Point point2 = point1; //These are known as reference types, because it doesn't store the actual value in the variable, it stores a reference to the object
        //Point 1 and Point 2 are referencing the exact same object in memory

        System.out.println(point1);

        point1.x = 2;
        System.out.println(point1);
        System.out.println(point2);//Even though we changed the x value of point 1, the changes are reflected in point2 because it is referencing the same object.

        point2.y = 5;
        System.out.println("We changed y in point2 but the changes are reflected in point1 as seen here: \n" + point1);

        //Using Strings

        String newGreeting = "How are you?";
        System.out.println(greeting + " " + newGreeting);

        System.out.println(newGreeting.length());//.length()
        System.out.println(newGreeting.indexOf("a"));//index of the char "a"

        System.out.println(newGreeting.endsWith("?"));//Returns a boolean value that could be true or false

        newGreeting = newGreeting.replace("are you?", "is it going?");

        System.out.println(greeting + " " + newGreeting);


    }
}
