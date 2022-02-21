package Homework10;

public class Square extends Figure implements Movable{

    protected static final int REFPOINTX = 50;
    protected static final int REFPOINTY = 100;

    public Square(int coordinateX, int coordinateY){
        super(coordinateX, coordinateY);
    }
     public void move(){
        coordinateX = REFPOINTX;
        coordinateY = REFPOINTY;
     }
}
