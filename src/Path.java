package Les_Petits_Chevaux.src;

import Les_Petits_Chevaux.src.Square;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Path extends SquareArray {
    private Square[] squareArray = new Square[57];
    private int pathPosition;
    private Color pathColor;
    private boolean inPist;
    

    public Path(Color pathColor) {
        this.pathPosition =0;
        this.pathColor = pathColor;
        this.inPist = false;
    }

    public void setInPist(boolean inPist) {
		this.inPist = inPist;
	}

	public boolean isInPist() {
		return inPist;
	}

	public int getPathPosition() {
        return this.pathPosition;
    }

    public void setPathPosition(int pathPosition) {
        this.pathPosition = pathPosition;
    }

    public Square getSquare(int i){
        return squareArray[i];
    }

    
    //refaire la fonction quand on aurait les chemin par couleur
    public int movePiece(int di,Piece p1, Square[] sq){
    	List<Piece> pieceIn = new ArrayList<Piece>();
        for(int i=di; i>0;i--){
            System.out.println(p1.getPiecePath().squareArray[p1.getcurrentPosition()+1]);
            pieceIn.add(p1);
            sq[p1.getcurrentPosition()+1].setPieceIn(pieceIn);
            pieceIn.remove(p1);
            sq[p1.getcurrentPosition()].setPieceIn(pieceIn);
            
        }
        
        return p1.getPiecePath().squareArray[p1.getcurrentPosition()].getSquareNumber();
    }
    
    public void initPath(Color color, Square[] defaultArray){
        int squareNumber = 0  ;
        if(color.equals(Color.GREEN)){
            squareNumber = 0;
        }else if(color.equals(Color.YELLOW)){
            squareNumber = 13;
        }else if(color.equals(Color.BLUE)){
            squareNumber = 26;
        }else if(color.equals(Color.RED)){
            squareNumber = 39;
        }

        int count = 0;

        while(count < 51 ){
            this.squareArray[count] = defaultArray[squareNumber];
            if(squareNumber == 51){
                squareNumber=0;
            }else{
                squareNumber++;
            }
            count++;
        }

        Square[] colorArray = new Square[6];
        colorArray = initSquaresColor(color);

        for(int i=0;i<6;i++){
            this.squareArray[count]=colorArray[i];
            count++;
        }


    }
  

}