import org.w3c.dom.ls.LSOutput;

public class StringPractice {
    public static void main(String[] args) {
        //Problem 1:
        //Write a Java program to get the charcter at the given index within the String

        String exercises = "Java Exercises";
        char charAt0 = exercises.charAt(0);
        char charAt10 = exercises.charAt(10);
        int indexOfJ = exercises.indexOf("J");
        int indexOfR = exercises.indexOf("r");


        System.out.printf("%nThe Character at position %d is: %c%nThe Character at position %d is: %c%n", indexOfJ, charAt0, indexOfR,charAt10);


        String address = "w3resource";
        System.out.printf("Original String: %s", address);


        /*codePointAt() method returns the character (Unicode point) at teh specified index.
         *The index refers to char values (Unicode units) and ranges
         * This method returns the code point value of the character at the index
         *
         *
         */

        //codepoint at index 1
        int val1 = address.codePointAt(1);
        //codepoint at index 9
        int val2 = address.codePointAt(9);

        //prints character at index 1 in String
        System.out.printf("%nCharacter(unicode point) = %d%nCharacter(unicode point) = %d%n", val1, val2);

        //Problem 2:
        //Concatenate strings

        String php = "PHP Exercises";
        String python = "Python Exercises";
        System.out.printf("%n%s and %s", php, python);

        //Problem 3:
        //Test if given string contains the specified sequence of char values

        String bothExercises = php + " and " + python;
        boolean containsAnd = bothExercises.contains("and");
        System.out.printf("%nOriginal String: %s%nSpecified sequence of char values: and%n%b%n", bothExercises, containsAnd);

        //Problem 4
        //Compare a given string to the specified character sequence

        String eOne = "example.com";
        String eTwo = "Example.com";
        String eThree = "example.com";
        String eFour = "Example.com";

        boolean eOneIseTwo = eOne.equals(eTwo);
        boolean eOneIseThree = eOne.equals(eThree);
        boolean eTwoIseThree = eTwo.equals(eThree);
        boolean eTwoIseFour = eTwo.equals(eFour);
        System.out.printf("%nComparing %s and %s: %b%nComparing %s and %s: %b%nComparing %s and %s: %b%nComparing %s and %s: %b%n", eOne, eTwo, eOneIseTwo, eOne, eThree, eOneIseThree, eTwo, eThree, eTwoIseThree, eTwo, eFour, eTwoIseFour);

    }



}
