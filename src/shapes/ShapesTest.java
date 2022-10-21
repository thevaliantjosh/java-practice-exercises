package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        System.out.println("The Perimeter is: " + box1.getPerimeter());
        System.out.println("The area is: " + box1.getArea());
        System.out.println("The Perimeter of box2 is: " + box2.getPerimeter());
        System.out.println("The Area of box2 is: " + box2.getArea());

    }
}
