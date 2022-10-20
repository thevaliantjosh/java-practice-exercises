public class Pen {
    String type = "gel";//The pen is a gel pen
    String color = "black";//The color is black
    int point = 7;//a point of 7

    static boolean clicked = false;

    public static void click(){
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }
}
