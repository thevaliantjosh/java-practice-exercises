package wrestlers_abstract;

public class Kane extends Wrestler{
    /*We cannot extend the superclass of Wrestler in the
    *subclass of Kane, without implementing all abstract methods
    *Alternatively the subclass can also be abstract
    *
    * */


    @Override
    public void themeMusic() {
        System.out.println("Kane's Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Tombstone");
    }
}
