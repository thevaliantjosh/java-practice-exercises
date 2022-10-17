import java.util.Scanner;

public class PassingParameters {
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
public static long getPower(int base, int exponent){
     if (exponent == 0){
         return 1;
     }  else if (exponent == 1){
         return base;
     } else if (exponent == 2){
         return base * base;
     }
     return base * getPower(base, exponent -1);
}
    public static int smallest(int x, int y, int z){
        return Math.min(Math.min(x, y), z);
    }
    /*Math.min() EXPLAINED
    * Because Math.min() only compares two arguments,
    * We nest x & y inside another Math.min
    * to then compare that result with z
    *
    * */
    public static int average(int x, int y, int z){
        return (x * y * z)/3;
    }
    public static void main(String[] args) {
        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);
        count(5);
        System.out.println(getPower(5, 5));

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        System.out.println("Input the third number: ");
        int z = in.nextInt();
        System.out.printf("The smallest value is: %d", smallest(x, y, z));
        System.out.printf("The average is: %d", average(x, y, z));
    }
}