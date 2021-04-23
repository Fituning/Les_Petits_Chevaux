package source;


import java.awt.*;

import java.util.ArrayList;
import java.util.List;


public class Path extends SquareArray {
    private Square[] squareArray = new Square[57];
    private int pathPosition;
    private boolean inPist;
    

    public Path(Color pathColor) {
        this.pathPosition =0;
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


//does not work for the end game
    public void refreshPawn(Piece p1, int dice){
    
        this.squareArray[p1.getPiecePath().getPathPosition()].removePieceIn(p1);
       
       String test=p1.getPieceSquare(p1.getPiecePath().getPathPosition()+dice).getSquareNumber();
       int pos=Integer.parseInt(test);
        
        p1.getPiecePath().setPathPosition(p1.getPiecePath().getPathPosition()+dice);
        this.squareArray[p1.getPiecePath().getPathPosition()].addPieceIn(p1);

        this.squareArray[p1.getPiecePath().getPathPosition()].comparePiecePosition(p1,this.squareArray);

        System.out.print("position final :"+ p1.getPieceSquare(p1.getPiecePath().getPathPosition()).getSquareNumber()+"\n");
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