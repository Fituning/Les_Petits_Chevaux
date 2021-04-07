package Les_Petits_Chevaux.src;

import java.util.ArrayList;
import java.util.List;

public class Square {
    private int squareNumber;
    private Position squarePosition;
    private boolean safeZone;
    private List<Piece> pieceIn = new ArrayList<Piece>();

    public Square(boolean safeZone, int x, int y,int square){
        this.safeZone = safeZone ;
        this.squarePosition = new Position(x, y);
        this.squareNumber = square;
    }


    @Override
    public String toString() {
        return "Square number : " + squareNumber + " , en x = " + squarePosition.getX()+" et y = " + squarePosition.getY()+". Is in safe zone " + safeZone;
    }
}

