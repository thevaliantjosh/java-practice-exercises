public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        System.out.println("Hello");//This is one line of code that does 1 thing, prints "Hello"

        int a = 0;//One line of code, does one thing, stores the integer 0 is a variable called "a"

        if(a == 0){//if a == 0
            System.out.println("A is zero!");//The code in this line will be executed.
        }
        //Calling the pen method

        Pen p = new Pen();
        //When we type in p and a dot . we can use everything that the pen method can do
        System.out.printf("The color of the pen is: %s%n", p.color);
        System.out.printf("The point of the pen is: %s%n", p.point);
        System.out.printf("Is the pen clicked? %b%n", p.clicked);

        //now we will change the status of the clicked method

        p.click();

        System.out.printf("Now is the pen clicked? %b%n", p.clicked);

        p.unClick();
        System.out.printf("Let's unclick the pen! %b", p.clicked);

        Headphones h = new Headphones();
        //Now we can use the Headphones method;

        System.out.printf("The color of the headphones are: %s%n", h.color);
        System.out.printf("The charge has a: %s%n", h.charge);
        System.out.printf("The controls of the headphones are: %s%n", h.control);


        System.out.println("Let's turn the headphones on%n");

        h.powerOn();

        System.out.printf("Are the headphones on? %b%n", h.power);
        System.out.println("Let's turn them off");

        h.powerOff();

        System.out.printf("Are the headphones off? %b%n", h.power);

    }
}
