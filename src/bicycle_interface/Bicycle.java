package bicycle_interface;

public interface Bicycle {
    //Interface: A group of related methods with empty bodies
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);

}
