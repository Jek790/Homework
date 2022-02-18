package Homework09;

public class FugureMain {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(25, 15, 20, 45);
        Square square = new Square(25);
        Ellipse ellipse = new Ellipse(23, 17);
        Circle circle = new Circle(56, 14, 32);
        Figure figure = new Figure();

        System.out.printf(rectangle + "периметр: \n", rectangle.getPerimeter());
        System.out.printf(square + "периметр: \n", square.getPerimeter());
        System.out.printf(ellipse + "периметр: %.3f \n", ellipse.getPerimeter());
        System.out.printf(circle + "периметр: %.3f \n", circle.getPerimeter());
        System.out.printf("Значение %.0f \n", figure.getPerimeter());
    }
}
