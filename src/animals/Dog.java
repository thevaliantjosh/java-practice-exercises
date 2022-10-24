package animals;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void breath() {

    }

    @Override
    public void eat() {
        System.out.println("Dog eats chikems");
    }

    @Override
    public void getHeight() {

    }
}
