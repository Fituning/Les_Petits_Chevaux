
package LudoGame.source;

import java.awt.Color;



public class Piece {
    private Color color;
    private int id;
    private Path piecePath;
    private boolean pathCompleted;
    private int currentPosition;
    private Position initialPosition;

public void setInitPosition(int x, int y){
    this.initialPosition = new Position(x, y);
}

public Position getInitPosition(){
    return this.initialPosition;
}

Piece(Color color,Square[] squareArray){
        this.color=color;
        this.pathCompleted=false;
        this.piecePath = new Path(color);
        this.piecePath.initPath(color,squareArray);
        this.id=12;
        this.currentPosition=0;
}

Piece(int id){
    this.pathCompleted=false;
    this.piecePath.setInPist(false);
    this.id=id;
    this.currentPosition=1;
}

//could be use if a pawn must be set to a particular square
public void setPiecePosition(int pos){
    this.currentPosition=pos;
    this.piecePath.setPathPosition(this.currentPosition);
}


public int getId() {
	return id;
}
public void setId(int nb) {
	this.id = nb;
}

public Square getPieceSquare(int i){
    return piecePath.getSquare(i);
}

//check if a dice roll correponding to a pawn is equal to 6 and if this is th case set the "inPist" value of the pawn to true
public void outside(Piece p1,int di){
    if(di==6){
        p1.piecePath.setInPist(true);
    }
}
    public int getcurrentPosition(){
        return this.currentPosition;
    }
    
    public void setCurrentPosition(int addPosition) {
    	this.currentPosition += addPosition;
        this.piecePath.setPathPosition(this.currentPosition);
    }

    public Color getColor() {
        return this.color;
    }

    public String getColorName(){
        if(this.color.equals(Color.RED)){
            return "R";
        }else if(this.color.equals(Color.BLUE)){
            return "B";
        }else if(this.color.equals(Color.GREEN)){
            return "G";
        }else if(this.color.equals(Color.YELLOW)){
            return "Y";
        }else{
            return null;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Path getPiecePath() {
        return this.piecePath;
    }


    public boolean getPathCompleted() {
        return this.pathCompleted;
    }

    public void setPathCompleted(boolean pathCompleted) {
        this.pathCompleted = pathCompleted;
    }

    public boolean canBePlayed( int dice){
        if(56-this.getPiecePath().getPathPosition()>=dice){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPathCompleted(){
        if(56-this.piecePath.getPathPosition()==0){
            setPathCompleted(true);
            return true;
        }
        else{
            return false;
        }

    }


}