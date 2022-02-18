package Homework09;

public class Ellipse extends Figure{

    private final int radius1;
    private final int radius2;

    public Ellipse (int radius1, int radius2, int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public Ellipse (int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double getPerimeter() {
        double value = Math.pow(radius1, 2) + Math.pow(radius2, 2);
        return 2*Math.PI*Math.sqrt(value / 2);
    }
    public String toString () {
        return "Эллипс с радиусами " + radius1 + " и " + radius2 + " имеет ";
    }
}
