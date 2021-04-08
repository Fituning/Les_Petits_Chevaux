package Les_Petits_Chevaux.src;

import java.awt.Color;
//test commit 
public class Main extends SquareArray{
    public static void main(String[] args) {
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
     //verifie si un pions est deja pr�sent sur une case si c'est le cas v�rifie si le pion qui arrive est de la meme �quipe que le pion deja pr�sent, si ce n'est pas le cas 
     //retire le pion de la case et le renvoi a sa maison (pas encore fait cette partie)
     
     public static void comparePiecePosition(Piece p1, Square[] sq){
   	 int lim = sq[p1.getcurrentPosition()].getPieceIn().size();
   	 
   		if(sq[p1.getcurrentPosition()].getPieceIn()!=null){
   			
   			for (int i=0;i<lim;i++) {
   				{
   					if(sq[p1.getcurrentPosition()].getPieceIn().get(i).getId()!=p1.getId() && sq[p1.getcurrentPosition()].isSafeZone()==false) {
   						
   						System.out.print("le pion returne a sa maison !");
   				}
   					else {
   						System.out.print("rien");
   					}
   				}

   				
   			}
   		}
   } 
 
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
