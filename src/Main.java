package Les_Petits_Chevaux.src;

public class Main {
    public static void main(String[] args) {
        Square[] squareArray2 = new Square[76];
        squareArray2 = initSquares2();
        for(int i=0; i< 52;i++){
            System.out.println(squareArray2[i]);
        }
        
    
    //test pour la présence de plusieur pion sur une case
    
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
     
     
     
     //verifi si un pions est deja présent sur une case si c'est le cas vérifie si le pion qui arrive est de la meme équipe que le pion deja présent, si ce n'est pas le cas 
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

    public static Square[] initSquares2(){
        Square[] squareArray = new Square[52];
        Position squarePosition = new Position(9, 1);
        int numberSquare=0;
        int translation[]  = {1,2,1,3,1,3,4,3,4,2,4,2};
        int t = 0;
        int numberTranslation = 6;
        int boucle=1;
        boolean safe = false;

        for(int i=0;i<52;i++){
            if(i == 0 || i== 8 || i== 13 || i== 21 || i== 26 || i== 34 || i== 39 || i== 49){
                safe = true;
            }
            numberSquare++;

            if(numberSquare == numberTranslation){
                if(boucle == 1 ){
                    boucle++;
                    numberTranslation = 6;
                }else if(boucle == 2) {
                    boucle++;
                    numberTranslation = 2; 
                }else if(boucle == 3){
                    boucle = 1;
                    numberTranslation = 5;
                }
                numberSquare = 0;
                t++;
                
                if(i == 18){
                    squarePosition.left();
                }else if(i == 5){
                    squarePosition.down();
                }else if(i == 31){
                    squarePosition.up();
                }else if(i == 44){
                    squarePosition.right();
                }
            }

            if (numberSquare <= numberTranslation){
                if(translation[t] == 1){
                    squarePosition.down();
                }else if(translation[t] == 2){
                    squarePosition.right();
                }else if(translation[t] == 3){
                    squarePosition.left();
                }else if(translation[t] == 4){
                    squarePosition.up();
                }
                
            }
            
            squareArray[i]= new Square(safe,squarePosition.getX(),squarePosition.getY(),i);
            safe= false;
        }
        return squareArray;
    }
}
