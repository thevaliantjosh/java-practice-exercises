package bikes;

public class Bicycle {
    //The Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;

    //getters and setters
    public void setCadence(int cadence){
        this.cadence = cadence;
    }

    public int getCadence(){
        return cadence;
    }

    public void setGear(int gear){
        this.gear = gear;
    }

    public int getGear(){
        return gear;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    //constructor
    public Bicycle(){

    }

    public Bicycle(int startCadence, int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
        this.cadence = startCadence;
    }

    //methods
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
        cadence += speed;
        gear++;
    }

}
