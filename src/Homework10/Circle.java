package Homework10;

public class Circle extends Figure implements Movable {

    protected static final int REFPOINTX = 100;
    protected static final int REFPOINTY = 50;

     public Circle (int coordinateX, int coordinateY) {
         super(coordinateX, coordinateY);
     }
     public void move(){
         coordinateX =REFPOINTX;
         coordinateY =REFPOINTY;
     }
}
