package Les_Petits_Chevaux.src;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class Square {
    private Position squarePosition;
    private boolean safeZone;
    private List<Piece> pieceIn = new ArrayList<Piece>();

    public Square(boolean safeZone, int x, int y){
        this.safeZone = false ;
        this.squarePosition.setX(x);
        this.squarePosition.setY(y);
    }

    
    public static Square[] initSquares(){
        Square N0 = new Square(true,9,2);
        Square N1 = new Square(false,9,3);
        Square N2 = new Square(false,9,4);

        Square[] squareArray = new Square[];
        int x = 9;
        int y = 1;
        int numberSquare=0;
        int changeDirection = 1;
        boolean patchCoordX = true; 
        boolean safe = false;

        for(int i=0;i<76;i++){
            if(i == 0 || i== 8 || i== 13 || i== 21 || i== 26 || i== 34 || i== 39 || i== 49){
                safe = true;
            }
            

             squareArray[i]= new Square(safe,x,y);

             numberSquare ++;
            
            if(numberSquare<7 && (changeDirection == 1 || changeDirection == 4) ){
                y++;
            }else if(numberSquare<7 && (changeDirection == 7 || changeDirection == 11) ){
                y--;
            }else if(numberSquare<7 && (changeDirection == 2 || changeDirection == 10) ){
                x++;
            }else if(numberSquare<7 && (changeDirection == 4 || changeDirection == 8) ){
                x--;
            }else if(numberSquare<3 && changeDirection == 3{
                y++;
            }else if(numberSquare<3 && changeDirection == 6{
                x--;
            }else if(numberSquare<3 && changeDirection == 9{
                y--;
            }else if(numberSquare<3 && changeDirection == 12{
                x++;
            }else if(numberSquare == 7 ){
                numberSquare = 1;
                if(changeDirection == 1){
                    x++;
                }else if(changeDirection == 4){
                    y++;
                }else if(changeDirection == 7){
                    x--;
                }else if(changeDirection == 10){
                    y--;
                }
                changeDirection ++;
            }else{
                changeDirection++;
                numberSquare = 1;
            }


             safe = false;
         }

        return squareArrary;
        
    }
}

