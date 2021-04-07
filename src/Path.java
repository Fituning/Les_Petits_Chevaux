package Les_Petits_Chevaux.src;

import Les_Petits_Chevaux.src.Square;
import java.awt.*;
import java.lang.reflect.Array;

public class Path {
    private Square[] squareArray = new Square[56];
    private int pathPosition;
    private Color pathColor;
    private boolean inPist;
    

    public Path(Color pathColor) {
        this.pathPosition =0;
        this.pathColor = pathColor;
        this.inPist = false;


    }

    public int getPathPosition() {
        return this.pathPosition;
    }

    public void setPathPosition(int pathPosition) {
        this.pathPosition = pathPosition;
    }

    public void initPath(Piece p1,Piece p2,Piece p3, Piece p4){

        Square N0 = new Square(true,9,2);
        

        /*p1.PiecePath().squareArray=new int[]{N0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,V1,V2,V3,V4,V5,V6};
        p2.PiecePath().squareArray=new int[]{13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,0,1,2,3,4,5,6,7,8,9,10,11,J1,J2,J3,J4,J5,J6};
        p3.PiecePath().squareArray=new int[]{26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,B1,B2,B3,B4,B5,B6};
        p4.PiecePath().squareArray=new int[]{39,40,41,42,43,44,45,46,47,48,49,50,51,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,R1,R2,R3,R4,R5,R6};

        p1.getcurrentPosition=p1.PiecePath().squareArray[0];
        p2.getcurrentPosition=p2.PiecePath().squareArray[0];
        p3.getcurrentPosition=p3.PiecePath().squareArray[0];
        p4.getcurrentPosition=p4.PiecePath().squareArray[0];
        */
        }
       
    

 //take the result of a dice and the current position po a pawn and return the position after the deplacement
//the for could be use if we want to show the deplacement of the pawn
//I use nbOfCaseTraveled to now if the pawn must go to the center (don't now how because the square don't have numbers).   
    public int movePiece(int di,Piece p1){

        for(int i=di; i>0;i--){
            System.out.println(p1.PiecePath.squareArray[p1.getcurrentPosition+1]);
            return p1.PiecePath.squareArray[p1.getcurrentPosition+1];
        }
}
}