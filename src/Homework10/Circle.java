package Homework10;

public class Circle extends Ellipse implements Movable {

    private final int radius;

    public Circle(int radius, int coordinateX, int coordinateY) {
        super(radius, radius, coordinateX, coordinateY);
        this.radius = radius;
    }

    public Circle(int radius) {
        super(radius,radius);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return coordinateX + " " + coordinateY;
    }

    @Override
    public void move(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
}
