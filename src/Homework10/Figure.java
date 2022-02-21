package Homework10;

public abstract class Figure {
    protected int coordinateX;
    protected int coordinateY;

    public Figure(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    public Figure() {
        coordinateX = 0;
        coordinateY = 0;
    }
    public abstract double getPerimeter();
}
