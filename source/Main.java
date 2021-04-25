package LudoGame.source;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//test commit 
public class Main extends SquareArray{
    public static void main(String[] args) {
//trying to implement the game loop
//player initialisation (not sure if it is the best way)
/*Random random = new Random();
int dice;
dice = 1+random.nextInt(6);
Square[] squareArray = new Square[57];
squareArray=initSquares();
Player player1=new Player();
Player player2=new Player();
Player player3=new Player();
Player player4=new Player();

player1.initPlayers(player1,1,squareArray);
player2.initPlayers(player2,2,squareArray);
player3.initPlayers(player3,3,squareArray);
player4.initPlayers(player4,4,squareArray);



//the NullpointerException occure because Pieces are not initialized correctly
while(player1.getTeam().win(player1)==false || player2.getTeam().win(player2)==false || player3.getTeam().win(player3)==false || player4.getTeam().win(player4)==false){
    System.out.println("tour de "+ player1.getPseudo());
//affichage bouton pour lancer les dés et choisir la pièce à bougé
//il faut initialiser les tableau de piece correctement


    random = new Random();
    dice = 1+random.nextInt(6);
    System.out.println("DICE VALUE"+dice);
    
    if(player1.getTeam().piecesArray[0].getPiecePath().isInPist()==true){
    player1.getTeam().piecesArray[0].getPiecePath().refreshPawn(player1.getTeam().piecesArray[0],dice);
    }
    else{
        if(dice==6){
            player1.getTeam().piecesArray[0].getPiecePath().setInPist(true);
        }
    }

    System.out.println("tour de "+ player2.getPseudo());
    random = new Random();
    dice = 1;
    System.out.println("DICE VALUE"+dice);
    if(player2.getTeam().piecesArray[0].getPiecePath().isInPist()==true){
        player2.getTeam().piecesArray[0].getPiecePath().refreshPawn(player2.getTeam().piecesArray[0],dice);
        }
        else{
            if(dice==6){
                player2.getTeam().piecesArray[0].getPiecePath().setInPist(true);
            }
        }



    System.out.println("tour de "+ player3.getPseudo());
    random = new Random();
    dice = 1+random.nextInt(6);
    System.out.println("DICE VALUE"+dice);
    if(player3.getTeam().piecesArray[0].getPiecePath().isInPist()==true){
        player3.getTeam().piecesArray[0].getPiecePath().refreshPawn(player3.getTeam().piecesArray[0],dice);
        }
        else{
            if(dice==6){
                player3.getTeam().piecesArray[0].getPiecePath().setInPist(true);
            }
        }

    System.out.println("tour de "+ player4.getPseudo());
    random = new Random();
    dice = 1+random.nextInt(6);
    System.out.println("DICE VALUE"+dice);
    if(player4.getTeam().piecesArray[0].getPiecePath().isInPist()==true){
        player4.getTeam().piecesArray[0].getPiecePath().refreshPawn(player4.getTeam().piecesArray[0],dice);
        }
        else{
            if(dice==6){
                player4.getTeam().piecesArray[0].getPiecePath().setInPist(true);
            }
        }


//...
}*/
        /**** Zone debug sale de Carlo *****/

        Square[] squareArray2 = new Square[52];
        squareArray2=initSquares();
        for(int i=0; i< 52;i++){
            System.out.println(squareArray2[i]);
        }

        System.out.println("/****** Green Squares ******\\\n");
        Square[] squareArrayGreen = new Square[6];
        squareArrayGreen=initSquaresColor(Color.GREEN);
        for(int i=0; i< 6;i++){
            System.out.println(squareArrayGreen[i]);
        }

        System.out.println("/****** Yellow Squares ******\\\n");
        Square[] squareArrayYellow = new Square[6];
        squareArrayYellow=initSquaresColor(Color.YELLOW);
        for(int i=0; i< 6;i++){
            System.out.println(squareArrayYellow[i]);
        }
        Square[] squareArray = new Square[57];
        squareArray=initSquares();

        Piece PieceG1 = new Piece(Color.RED, squareArray);
        Piece PieceG2 = new Piece(Color.BLUE, squareArray);
        for(int i=0; i< 57;i++){
            System.out.println(PieceG1.getPieceSquare(i));
        }
        
        /**** Zone debug sale de Cécé ****/
        

/*Random randome = new Random();
int nb;
nb = 1+randome.nextInt(6);
System.out.print(nb);
nb=14;
int nb1=1;

System.out.print("position initiale1 :"+PieceG1.getPieceSquare(0).getSquareNumber()+"\n");
System.out.print("position initiale2 :"+PieceG2.getPieceSquare(0).getSquareNumber()+"\n");

PieceG1.getPiecePath().refreshPawn(PieceG1,nb1);
PieceG2.getPiecePath().refreshPawn(PieceG2,nb);*/

    //test pour la pr�sence de plusieur pion sur une case
    
   	/*Piece p1 = new Piece(0);
   	Piece p2 = new Piece(4);
   	List<Piece> pieceIn = new ArrayList<Piece>();
   	pieceIn.add(p2);
   	pieceIn.add(p1);
   	squareArray2[p1.getcurrentPosition()].setPieceIn(pieceIn);
   	
   	 int lim = squareArray2[p1.getcurrentPosition()].getPieceIn().size();
   	 
   		if(squareArray2[p1.getcurrentPosition()].getPieceIn()!=null)
   			
   			for (int i=0;i<lim;i++) {
   				{
   					System.out.print(squareArray2[p1.getcurrentPosition()].getPieceIn().get(i).getId());
   				}		
   			}
   	comparePiecePosition(p1,squareArray2);  
   	
   	System.out.print(squareArray2[p1.getcurrentPosition()].getPieceIn().get(0).getId());
   	System.out.print(p2.getId());*/
     
     
    }


//sshitty test version

    /*public static Square[] initSquares(){

        Square[] squareArray = new Square[76];
        Position squarePosition = new Position(9, 2);
        int numberSquare=2;
        int changeDirection = 1;
        boolean safe = false;

        for(int i=0;i<52;i++){
            if(i == 0 || i== 8 || i== 13 || i== 21 || i== 26 || i== 34 || i== 39 || i== 49){
                safe = true;
            }

            squareArray[i]= new Square(safe,squarePosition.getX(),squarePosition.getY(),i);

            numberSquare ++;
            
            if(numberSquare<7 && (changeDirection == 1 || changeDirection == 5) ){
                squarePosition.down();
            }else if(numberSquare<7 && (changeDirection == 7 || changeDirection == 11) ){
                squarePosition.up();
            }else if(numberSquare<7 && (changeDirection == 2 || changeDirection == 10) ){
                squarePosition.right();
            }else if(numberSquare<7 && (changeDirection == 4 || changeDirection == 8) ){
                squarePosition.left();
            }else if(numberSquare<3 && changeDirection == 3){
                squarePosition.down();
            }else if(numberSquare<3 && changeDirection == 6){
                squarePosition.left();
            }else if(numberSquare<3 && changeDirection == 9){
                squarePosition.up();
            }else if(numberSquare<3 && changeDirection == 12){
                squarePosition.right();
            }else if(numberSquare == 7 ){
                numberSquare = 1;
                if(changeDirection == 1 || changeDirection == 11){
                    squarePosition.right();
                }else if(changeDirection == 4 || changeDirection == 2 ){
                    squarePosition.down();
                }else if(changeDirection == 7 || changeDirection == 5){
                    squarePosition.left();
                }else if(changeDirection == 10 || changeDirection == 8){
                    squarePosition.up();
                }

                if(changeDirection == 1 ){
                    squarePosition.down();
                }else if(changeDirection == 4 ){
                    squarePosition.left();
                }else if(changeDirection == 7 ){
                    squarePosition.up();
                }else if(changeDirection == 10 ){
                    squarePosition.right();
                }

                changeDirection ++;
            }else{
                if(changeDirection == 3){
                    squarePosition.left();
                }else if(changeDirection == 6){
                    squarePosition.up();
                }else if(changeDirection == 9){
                    squarePosition.right();
                }else if(changeDirection == 12){
                    squarePosition.down();
                }
                changeDirection++;
                numberSquare = 2;
            }
            
           

             safe = false;
         }



        //  for(int i=52;i<58;i++){
        //     squareArray[i]= new Square(safe,x,y);
        //  }

        return squareArray;
        
    }*/

    
}











