public class Account {
    //Getters and Setters let you get, and set, variables inside a class

    //Variables
    private String name;

    private int age;

    //A setter, this tells it that the parameter name is equal to name.
    //Sets the parameter to the variable of name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    //Constructor




    public void printDetails(){
        System.out.println("This is " + getName()+ "'s account" + ", His age is: " + getAge());
    }


}
