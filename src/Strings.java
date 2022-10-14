import java.util.Objects;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /*Strings are objects not primitives
        * String variables are a reference types, not a primitive type
        * The == operator does not behave as expected when comparing strings
        * using the == operator with two objects checks if both sids are the same reference, that is, if they refer to the same object
        * This is not the same as checking ot see if the two objects have the same value.
        * */

        //Immutability and Concatenation

        //Strings are immutable, this means that once a strings is created, it cannot be changed

        //Examples of string concatenation:

//        String message = "Hello";
//        System.out.println(message);
//
//        message = message + ", World!";
//        System.out.println(message);

        /*This may seem like we changed the value of message
        * However, we are actually creating a new String object, and
        * updating the message variable to reference the new String object
        * instead of the old one
        *
        * COMPARING STRINGS
        *
        * Strings are not primitive, but objects.
        * We need to use methods to compare them rather than the relational operators
        *
        * */
        Scanner in = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
//
//        String userInput = in.next();
//
//
//        boolean confirmation = userInput.equals("y");
//        if(confirmation){
//            String newString = "I am a string";
//            System.out.println("Let's continue!");
//            if(newString.equals("I am a string")){
//                System.out.println("The strings are equal!");
//            }
//        } else {
//            System.out.println("Lame");
//        }

        /*STRING COMPARISON METHODS
        *
        *
        *.equals >> Determines, case-sensitivity, if two strings have the same value
        * .equalsIgnoreCase >> determine if two strings have the same value, disregarding their casing
        *
        * .startsWith >> determine, case-sensitivity, if on string starts with another
        *
        * .endsWith >> determine, case-sensitivity, if one string ends with another
        *
        * */

        //Want to have to continue to type into the console until the user input equals the String codeup




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


        String codeup = "Codeup Rocks!";

        System.out.println("equals: " + codeup.equals("codeup rocks!"));
        System.out.println("equals: " + codeup.equals("Codeup Rocks!"));
        System.out.println("equalsIgnoreCase: " + codeup.equalsIgnoreCase("coDeUp rOckS!"));
        System.out.println("startsWith: " + codeup.startsWith("Codeup"));
        System.out.println("endsWith: " + codeup.endsWith("Rocks!"));
        System.out.println("endsWith: " + codeup.endsWith("rocks!"));



        while(true){
            System.out.println("What rhymes with sewed pup socks?");
            String matchTheString;
            matchTheString = in.nextLine();
            switch(matchTheString){
            case "Codeup Rocks!"-> System.out.println("So True! You nailed it!");
            case "Codeup Rocks" -> System.out.println("So Close! Add the exclamation!");
            case "codeup rocks!" -> System.out.println("True: But Capitalize the first letters");
            case "Codeup rocks!" -> System.out.println("Close! Capitalize the second word and you got it!");
            case "codeup rocks" -> System.out.println("True: But Capitalize the first letters and give it an exclamation point!");
            case "Hint" -> System.out.println("It starts with codeup!");
            case "codeup rockds" -> System.out.println("Close! Check your spelling");
            case "blowed up blocks" -> System.out.println("True: That does rhyme but try using codeup?");
            default -> System.out.println("False: That didn't match. Check your spelling and try again");

            }
            if(matchTheString.equals(codeup)){
                break;
            }
        }

        /*STRING MANIPULATION METHODS
        *
        * char charAt(int index) >> Returns the character at the specified index of the string
        *
        * int indexOf(String subString) >> Return the index of the first occurrence of a certain substring: Returns -1 if the substring is not found
        *
        * int lastIndexOf(String subString) >> Like indexOf, but starts the search from the end of the string
        *
        * int length() >> Returns the length of a string
        *
        * String replace(String pattern, String replacement) >> Returns a copy of the string that has pattern replaced with replacement
        *
        * String substring (int beginIndex [, int endIndex]) >> Returns a new substring that starts at a specified index and (optionally) ends at the specified index
        *
        * String toLowerCase() >> Returns a string that has all lower case letters
        *
        * String toUpperCase() >> Returns a string that has all upper case letters
        *
        * String trim() >> Returns a copy of hte string without leading and trailing whitespaces
        * */
        
        //Manipulating Characters in a String
        
        String anotherPalindrome = "Niagara. O roar again!";
        char aChar = anotherPalindrome.charAt(9);
        int indexOfO = anotherPalindrome.indexOf("O");
        System.out.printf("The string: %s%n has the character \"%c\" at the index of: %d%n", anotherPalindrome, aChar, indexOfO);

        String roar = anotherPalindrome.substring(11, 15);
//        int indexOfR = anotherPalindrome.indexOf("r");

        System.out.printf("The substring %s is from index 11 to 15, not including the blank space of 15", roar);




    }
}
