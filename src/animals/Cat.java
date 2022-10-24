package animals;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void breath() {

    }

    @Override
    public void eat() {
        System.out.println("Cow eats fish and birds");
    }

    @Override
    public void getHeight() {

    }
}
