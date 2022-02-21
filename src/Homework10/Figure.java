package Homework10;

public abstract class Figure {

    protected int coordinateX;
    protected int coordinateY;

    public Figure(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }


    public abstract void move();
}
