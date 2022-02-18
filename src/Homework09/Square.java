package Homework09;

public class Square extends Rectangle {

    private int side;

    public Square (int side, int coordinateX, int coordinateY) {
        super(side, side, coordinateX, coordinateY);
    }

    public Square (int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
    public String toString (){
        return "Квадрат со стороной " + side + " имеет ";
    }
}
