package bicycle_interface;

public class ACMEBicycle implements Bicycle{
    //Declaring Variables
    int cadence = 0;
    int speed = 0;
    int gear = 1;


    //Methods Implemented from Bicycle Interface


    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    //ACME Bike unique Method

    public void printStates(){
        System.out.println("Cadence: " + cadence + " speed: " + speed + " gear:" + gear);
    }
}
