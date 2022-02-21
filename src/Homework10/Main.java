package Homework10;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Circle(23,16);
        figure[1] = new Square(12,84);
        figure[2] = new Square(34,11);
        figure[3] = new Circle(6,44);
        figure[4] = new Square(45,52);

        for (int i = 0; i < figure.length; i++) {
            System.out.println("X = " + figure[i].getCoordinateX() + " Y = " + figure[i].getCoordinateY());
        }

        for (int i = 0; i < figure.length; i++) {
            figure[i].move();
            System.out.println("X = " + figure[i].getCoordinateX() + " Y = " + figure[i].getCoordinateY());
        }
    }
}
