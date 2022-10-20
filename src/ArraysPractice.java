import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //Declare an Array of integers

        int[] anArray;

        //Allocates memory for 10 integers

        anArray = new int[10];

        //initialize first element

        anArray[0] = 100;

        //initialize second element

        anArray[1] = 200;

        //and so forth

        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.printf("Element at index 0 is: %d%n", anArray[0]);
        System.out.printf("Element at index 1 is: %d%n", anArray[1]);
        System.out.printf("Element at index 2 is: %d%n", anArray[2]);
        System.out.printf("Element at index 3 is: %d%n", anArray[3]);
        System.out.printf("Element at index 4 is: %d%n", anArray[4]);
        System.out.printf("Element at index 5 is: %d%n", anArray[5]);
        System.out.printf("Element at index 6 is: %d%n", anArray[6]);
        System.out.printf("Element at index 7 is: %d%n", anArray[7]);
        System.out.printf("Element at index 8 is: %d%n", anArray[8]);
        System.out.printf("Element at index 9 is: %d%n", anArray[9]);


        //Shortcut syntax

        int[] arrayOfNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(arrayOfNums.length);
        System.out.println(Arrays.toString(arrayOfNums));

        //Copying Arrays

        int[] combineNumbersArrays = new int[20];
        System.arraycopy(anArray, 0, combineNumbersArrays, 0, 10);
        System.out.println(combineNumbersArrays.length);
        System.out.println(Arrays.toString(combineNumbersArrays));

        System.arraycopy(arrayOfNums, 0, combineNumbersArrays, 10, 10);

        /*public Static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        * the two Object arguments specify the array to copy form and the array to copy to
        * The three int arguments specify:
        * 1. The starting position in the source array
        * 2. The starting position in the destination array
        * 3. The number of elements to copy
        *
        *
        * */

        System.out.println(Arrays.toString(combineNumbersArrays));

        int[] ages = {12, 16, 17, 18, 21, 30, 40, 50, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        boolean[] students = new boolean[17];

        students[0] = true;
        students[1] = true;
        students[2] = true;
        students[3] = true;
        students[4] = true;
        students[5] = false;
        students[6] = false;
        students[7] = false;
        students[8] = false;
        students[9] = false;
        students[10] = false;
        students[11] = false;
        students[12] = false;
        students[13] = false;
        students[14] = false;
        students[15] = false;
        students[16] = false;


        for(boolean student : students){
            System.out.println(student);
        }

        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }



    }

}
