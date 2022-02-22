package Homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FugureMain {
    public static void main(String[] args) {


//        Rectangle rectangle = new Rectangle(25, 15, 20, 45);
//        Square square = new Square(25);
//        Ellipse ellipse = new Ellipse(23, 17);
//        Circle circle = new Circle(56, 14, 32);
//
//        System.out.printf(rectangle + "периметр: \n", rectangle.getPerimeter());
//        System.out.printf(square + "периметр: \n", square.getPerimeter());
//        System.out.printf(ellipse + "периметр: %.3f \n", ellipse.getPerimeter());
//        System.out.printf(circle + "периметр: %.3f \n", circle.getPerimeter());

        Movable[] figures = new Movable[2];

        figures[0] = new Circle(2,78, 13);
        figures[1] = new Square(50,24, 51);
        System.out.println(Arrays.toString(figures));
        for (Movable value : figures) {
            value.move(1,5);
        }
        System.out.println(Arrays.toString(figures));
    }
}
