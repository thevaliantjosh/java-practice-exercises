package animals;

public class AnimalTest {
    public static void main(String[] args) {
        Robin robby = new Robin("Robby");

        Bird bob = new Bird("Bob");

        System.out.printf("%s goes: %s", robby.getName(), robby.sing());
    }
}
