package wrestlers_interface;

public class Kane implements Wrestler{
    @Override
    public void themeMusic() {
        System.out.println("Kane's theme Music");
    }

    @Override
    public void finisher() {
        System.out.println("Tombstone");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Kane will make $" + hours*200.00 + " for his match.");
    }
}
