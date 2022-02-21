package Homework10;

public class Square extends Rectangle implements Movable {

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
        return coordinateX + " " + coordinateY;

    }

    @Override
    public void move(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
}
