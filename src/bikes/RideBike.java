package bikes;

public class RideBike {

    public static void bikeStatus(Bicycle bicycle){
        int currentCadence = bicycle.getCadence();
        int currentSpeed = bicycle.getSpeed();
        int currentGear = bicycle.getGear();

        System.out.printf("\tYou hop on your bicycle%n#Your current speed is: %d%n#Your current cadence is: %d%n#Your currently in gear%d%n", currentSpeed, currentCadence, currentGear);
    }
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(60, 14, 2);

        bikeStatus(myBike);
        myBike.speedUp(4);
        bikeStatus(myBike);
        myBike.speedUp(1);
        bikeStatus(myBike);
//        myBike.speedUp(2);
//        bikeStatus(myBike);
//        myBike.setSpeed(18);
//        bikeStatus(myBike);
//        myBike.applyBrake(5);
//        bikeStatus(myBike);

//        System.out.println(myBike);



    }
}
