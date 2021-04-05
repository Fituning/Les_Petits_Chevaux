package Les_Petits_Chevaux.src;

import java.awt.*;

public class Piece {
    private Color color;
    private Path piecePath;
    private boolean pathCompleted;
    private int currentPosition;


Piece(Color color){
        this.color=color;
        this.pathCompleted=false;
        this.Path.inPist=false;
        this.nbOfCaseTraveled=0;
}
//could be use if a pawn must be set to a particular square
public void setPiecePosition(int pos){
    this.Path.pathPosition=pos;
}





//check if 2 pawn are one the same square (should check for the 4 pawn but we should still be able to find wich pawn is on the same squre to send it home)
public boolean comparePawnPosition(Piece p1,Piece p2){
    if(p1.getPathPosition==p2.getPathPosition){
        return true;
    }
    else
        return false;
}

//check if a dice roll correponding to a pawn is equal to 6 and if this is th case set the "inPist" value of the pawn to true
public void outside(Piece p1,int di){
    if(di==6){
        p1.Path.inPist=true;
    }
}
    public int getcurrentPosition(){
        return this.currentPosition;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Path getPiecePath() {
        return this.piecePath;
    }

    public boolean isPathCompleted() {
        return this.pathCompleted;
    }

    public boolean getPathCompleted() {
        return this.pathCompleted;
    }

    public void setPathCompleted(boolean pathCompleted) {
        this.pathCompleted = pathCompleted;
    }






}