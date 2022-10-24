package shapes;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side, side);//calling the Rectangle constructor and passing in the values of side;
    }

    //Methods

    public double getPerimeter(){
        return 4 * super.length;
    }

    public double getArea(){
        return Math.pow(super.length, 2);
    }

}
