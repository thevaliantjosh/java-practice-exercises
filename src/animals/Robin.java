package animals;

public class Robin extends Bird{

    //Constructor
    public Robin(){

    }

    public Robin(String name){
        super.setName(name);//runs the super classes set name
    }

    //Method
    public String sing(){
        return "twiddledeedee";
    }
}
