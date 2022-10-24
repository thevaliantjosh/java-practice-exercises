package animals;

public class Cow extends Animal{
    public void speak(){
        System.out.println("Mooooooooo");
    }

    @Override
    public void breath() {

    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }

    @Override
    public void getHeight() {

    }
}
