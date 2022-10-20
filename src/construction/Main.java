package construction;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setSize('M');
        shirt.setColor("Blue");
        shirt.putOn(shirt);

        Shirt newShirt = new Shirt("White", 'L');
        shirt.putOn(newShirt);

        Shirt.takeOff(shirt);
        Shirt.takeOff(newShirt);


    }

}
