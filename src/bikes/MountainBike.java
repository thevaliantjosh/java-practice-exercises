package bikes;

public class MountainBike extends Bicycle{
    //the MountainBike subclass adds one field
    private int seatHeight;



    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    //the Mountainbike subclass has one constructor


    public MountainBike() {

    }

    public MountainBike(int startCadence, int startSpeed, int startGear, int seatHeight) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = seatHeight;
    }

    //the MountainBike subclass adds one method


}
