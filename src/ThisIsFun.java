public class ThisIsFun {

    int a;
    int b;

    String food;
    char size;

    public void setData(String food, char size){
        this.food = food;
        this.size = size;
    }

    public void setData(int a, int b){
        this.a = a;//these are the same variable, and it doesn't know where to put the values
        this.b = b;//so if we change it to this, it will work;
        //We also have to remove the static;
        //this is calling the class. so we are saying ThisIsFun.a
    }

    public static void main(String[] args) {




        ThisIsFun t = new ThisIsFun();
        t.setData(4, 5);//We then call the method from ThisIsFun() class and pass in the parameters
        System.out.println(t.a);//this will show 0;
        System.out.println(t.b);//and this will also sho 0;

        t.setData("Pizza", 'L');
        System.out.println(t.food);
        System.out.println(t.size);

    }
}
