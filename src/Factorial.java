import java.util.Scanner;

public class Factorial {

    public static long factorial(long number){
            if (number <=1){
                return 1;
            } else {
                return number * factorial(number -1);
            }

    }

    public static void callFactorial(){
        Scanner in = new Scanner(System.in);
        String usersInput;
        do {
            System.out.println("Please Enter a number between 1 and 10");
            System.out.println(factorial(in.nextLong()));
            in.nextLine();
            System.out.println("Would you like to find the factorial of another number?");
            usersInput = in.nextLine();
        } while(usersInput.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {
        //Calculate the Factorial of a number
        //A Factorial is a number multiplied by each of the numbers before it
        //Maybe, if I divide the number by itself, then multiply that solution by the originial number it will give me the answer
        //So A Factorial of 5 is: 1 * 2 * 3 * 4 = 24
        //5 / 5 = 1 * 5 = 5
        //5/5 = 1 ...(n-1)*n then loop until n >= n;
        //5! = 1 * 2 * 3 * 4 * 5 = 120;

        //Getting the factorial iteratively

        int factorialProduct = 1;
        for(int i=1; i <=10; i++){
            factorialProduct = factorialProduct * i;
        }
        System.out.println("The factorial for 10 is: " + factorialProduct);
        Scanner in = new Scanner(System.in);

        callFactorial();

    }
}
