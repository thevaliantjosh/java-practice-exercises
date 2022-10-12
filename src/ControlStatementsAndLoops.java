import java.util.Arrays;
import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        float discountPercent = 2.3F;

        //Declarations
        Scanner in = new Scanner(System.in);
        float usersNumber;

        //Prompt the user for the desired Discount
        System.out.print("Enter a decimal number, if you get it right, you receive a discount! ");
        //Read in Value for the UsersNumber
        usersNumber = in.nextFloat();


        //Refactor the below code to loop every time the wrong answer is given,
        //and only end if the correct discount is applied.
        if (discountPercent == usersNumber) {
            System.out.printf("You nailed it! Your discount is: %02.2f!%n ", discountPercent);
        } else {
            System.out.printf("That's not right. %02.2f is not the right discount. ", usersNumber);
        }

        System.out.print("Try again? [y/N] ");
        String userInput = in.next();

        boolean confirmation = userInput.equals("y");
        if (confirmation){
            System.out.println("Enter a decimal number, if you get it right, you receive a discount! ");
//            usersNumber = in.nextFloat();
        }

    }
}
