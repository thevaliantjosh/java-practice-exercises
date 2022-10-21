package wrestlers_interface;

public class StoneCold implements Wrestler{
    @Override
    public void themeMusic() {
        System.out.println("Stone Cold's Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold Stunner");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Stone Cold will make $" + hours*300.00 + " for his match");
    }
}
