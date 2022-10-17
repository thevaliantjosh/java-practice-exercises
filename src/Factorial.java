import java.util.Scanner;

public class Factorial {

    public static long factorial(long number){

        Scanner in = new Scanner(System.in);

        long factorial = number * (number * (number - 1));
        if(number == 1){
            System.out.println("Please Enter a number between 1 and 10");
            number = in.nextLong();
            System.out.println("factorial(" + number + ") = 1");
            return 1;
        } else {
            System.out.printf("The factorial of %d is: %d%n", number, factorial);
            return number * factorial(number -1);

        }


    }
    public static void main(String[] args) {
        //Calculate the Factorial of a number
        //A Factorial is a number multiplied by each of the numbers before it
        //Maybe, if I divide the number by itself, then multiply that solution by the originial number it will give me the answer
        //So A Factorial of 5 is: 1 * 2 * 3 * 4 = 24
        //5 / 5 = 1 * 5 = 5
        //5/5 = 1 ...(n-1)*n then loop until n >= n;
        //5! = 1 * 2 * 3 * 4 * 5 = 120;

        factorial(5);
    }
}
