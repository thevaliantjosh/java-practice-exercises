public class Methods2 {
    public static void main(String[] args) {
      sayHello();
      sayHello(3);
      sayHello("Joshua");
      sayHello("Salutations", "Codeup");
    }
    //version 1
    public static void sayHello(int times){
        for (int i = 0; i < times; i++){
            sayHello();
        }
    }
    //version 2
    public static void sayHello(){
        sayHello("Hello", "World");
    }
    //version 3
    public static void sayHello(String name){
        sayHello("Hello", name);
    }
    //version 4
    public static void sayHello(String greeting, String name){
        System.out.println(greeting + ", " + name + "!");
    }
}
