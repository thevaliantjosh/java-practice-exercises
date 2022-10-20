package people;

public class Person {
    protected String name;

    private int age;



    //getters and setters


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //Constructor

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String sayHello(){
        return "Hello, How are you?";
    }


}
