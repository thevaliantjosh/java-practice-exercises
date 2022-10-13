import java.util.Arrays;
import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
//        float discountPercent = 2.3F;
//
//        //Declarations
        Scanner in = new Scanner(System.in);

        //If Statements


        //We can create a block of code if some condition evaluates to true;
        System.out.println("How old are you?");
        byte age;
//        age = in.nextByte();
        age = Byte.parseByte(in.nextLine());
        if (age >= 18 && age < 75){
            System.out.println("You are an adult!");
        } else if (age >= 75){
            System.out.println("Ok Boomer!");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a tiny baby!");
        }

        //Switch Statement

        System.out.println("What day is it today?");
        String day;
        day = in.nextLine().toLowerCase();
//        in.nextLine();




        switch(day){
            case "sunday" -> System.out.println("It is Sunday");
            case "monday" -> System.out.println("It is Monday");
            case "tuesday" -> System.out.println("It is Tuesday");
            case "wednesday" -> System.out.println("It is Wednesday");
            case "thursday" -> System.out.println("It is Thursday");
            case "friday" -> System.out.println("It is Friday");
            case "saturday" -> System.out.println("It is Saturday");
            default -> System.out.println("That is not a day of the week");
        }

        //While loop = continually executes a block of statements whil a particular condition is true.


        String usersName = " ";


        while(usersName.isBlank()){
            System.out.println("Please Enter Your name");
            usersName = in.nextLine();
        }
        System.out.printf("Hello %s!%n", usersName);


        //For loop = executes a block of code a limited amount of time

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Happy New Year!");


//        boolean usersAge;
//        usersAge = in.hasNextBoolean();
//        switch (usersAge){
//            case usersAge > 18 -> System.out.println("You are an adult!");
//            case usersAge < 18 -> System.out.println("You are a tiny baby!");
//            default -> System.out.println("Your a fossil!");
//        }

        //Prompt the user for the desired Discount
//        System.out.print("Enter a decimal number, if you get it right, you receive a discount! ");
//        //Read in Value for the UsersNumber
//        float usersNumber;
//        usersNumber = in.nextFloat();
//
//        boolean confirmation = userInput.equals("y");
//        userInput = in.next();
//        switch (usersNumber){
//            case discountPercent -> System.out.printf("You Nailed it! Your discount is %2.2f")
//        }




        //        in.nextLine();
//        System.out.println("What Flavor Do you want?");
//        String customerChoice;
//        customerChoice = in.nextLine();
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("Sorry, We don't have that");
//        }

        //Refactor the below code to loop every time the wrong answer is given,
        //and only end if the correct discount is applied.
//        String userInput;
//
//
//       if (discountPercent == usersNumber) {
//                System.out.printf("You nailed it! Your discount is: %02.2f!%n ", discountPercent);
//        } else if(confirmation){
//           boolean confirmation = userInput.equals("y");
//                userInput = in.next();
//       } else {
//            System.out.printf("That's not right. %02.2f is not the right discount. ", usersNumber);
//            System.out.print("Try again? [y/N] ");
//
//        }



    }
}
