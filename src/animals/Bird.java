package animals;

public class Bird {

    //Variables
    private String name;

//getters and setters

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Constructors

    public Bird(){

    }

    public Bird(String name){
        this.name = name;
    }

    //Methods
    public String sing(){
        return "tweet tweet tweet";
    }
}
