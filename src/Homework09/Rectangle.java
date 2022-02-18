package Homework09;

public class Rectangle extends Figure{

    private final int height;
    private final int length;

    public Rectangle(int height, int length, int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
        this.height = height;
        this.length = length;
    }

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (height + length) * 2;
    }
    public String toString() {
        return "Прямоугольник с длинной " + length + " и шириной " + height + " имеет ";
    }
}
