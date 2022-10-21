package wrestlers_abstract;

public abstract class Wrestler {
    /*If There is a mixture of unique and generalized methods that your subclasses
    * will inherit, then you should use an Abstract class as the super class
    * */

    //the below method will be the same for each wrestler
    public void paymentForWork(int hours){
        System.out.println("The Wrestler will make $" + hours*250.00 + " for tonight's match");
    }
    public abstract void themeMusic();//This will be different for Each wrestler

    public abstract void finisher();//This will be different for Each wrestler
}
