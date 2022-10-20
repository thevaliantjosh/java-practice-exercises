package people;

public class SignIn {
    public static void main(String[] args) {
        Employee john = new Employee("John");
        Person jacob = new Person("Jacob");
        Person joshua = new Person("Joshua", 31);
        System.out.println(joshua.getName() + " is " + joshua.getAge());

//        jacob.sayHello();
//        john.sayHello();
//        System.out.println(john.getName());
//        System.out.println(jacob.getName());
//        sayHello();
        System.out.printf("%s says %s%n", jacob.getName(), jacob.sayHello());
        System.out.printf("%s says %s%n", john.getName(), john.sayHello());
        System.out.printf("%s does %sall day!%n", john.getName(), john.work());


        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName());
        System.out.println(theManOfSteel.getSecretIdentity());

//        Employee one = new Employee();
//        Employee two = new Employee();



    }
}
