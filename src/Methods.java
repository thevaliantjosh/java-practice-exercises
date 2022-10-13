public class Methods {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Joshua";
        System.out.println(sayHello(greeting, name));
        sayHello(5);
        sayHello();
        System.out.printf("Give me a %d!%n", returnThree());
        System.out.println(shout("Hello, How are you?"));
    }
    public static String sayHello(String greeting, String name){
        return String.format("%s, %s!", greeting, name);
    }
    public static String shout(String s){
        return s.toUpperCase() + "!!!";
    }
    public static int returnThree() {
        return 3;
    }
    public static void sayHello(int times){
        for (int i = 0; i < times; i++){
            System.out.println("Hello");
        }
    }
    public static void sayHello(){
        System.out.println("Hello, World");
    }
}
