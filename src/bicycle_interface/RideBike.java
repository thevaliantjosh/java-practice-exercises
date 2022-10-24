package bicycle_interface;

public class RideBike {
    public static void main(String[] args) {
        Bicycle myBike = new ACMEBicycle();
        myBike.changeCadence(30);
        myBike.changeGear(2);
        myBike.speedUp(20);
        ((ACMEBicycle) myBike).printStates();



    }//End of Main


}//End of Class
