package construction;

public class Shirt {
    //setting variables
    private String color;
    private char size;


    //Getters and Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Shirt(){//no arg constructor

    }

    public Shirt(String color, char size){
        this.color = color;
        this.size = size;
    }

    public void putOn(Shirt newShirt){
        System.out.printf("You put on the %s, size: %c, shirt!%n", newShirt.getColor(), newShirt.getSize());
    }

    public static void takeOff(Shirt newShirt){
        System.out.printf("You take off the %s, size: %c, shirt!%n", newShirt.getColor(), newShirt.getSize());
    }



}
