public class Headphones {
    //Representing real things as objects in the computer

    String charge = "Micro USB";
    String[] control = {"power", "volume", "skip", "play/pause"};
    String color = "Red/Black";
    static int volume = 0;
    static boolean power = false;

    public static void powerOn(){
        power = true;
    }

    public static void powerOff(){
        power = false;
    }

    public static void volumeUp(){
        volume++;
    }

    public static void volumeDown(){
        volume--;
    }


}
