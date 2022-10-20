package people;

public class Employee extends Person{

    private double salary;

//    public String doWork(){
//        return "Work, work....";
//    }

    public String sayHello(){
        return "How can I help you";
    }

    public String work(){
        return "Filling out TPS reports";
    }
    public Employee(){

    }
    public Employee(String employeeName){
        super(employeeName);
    }


}
