package Les_Petits_Chevaux.src;

import java.awt.*;

public class SquareArray{

    public static Square[] initSquares(){
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
            
            squareArray[i]= new Square(safe,squarePosition.getX(),squarePosition.getY(),""+i);
            safe= false;
        }
        return squareArray;
    }

    public static Square[] initSquaresColor(Color color){
        Square[] squareArray = new Square[6];
        if(color.equals(Color.GREEN)){
            Position squarePosition = new Position(8, 2);
            for(int i=0;i<6;i++){
                squareArray[i]= new Square(true,squarePosition.getX(),squarePosition.getY(),"G"+(i+1));
                squarePosition.down();
            }
        }else if(color.equals(Color.YELLOW)){
            Position squarePosition = new Position(14, 8);
            for(int i=0;i<6;i++){
                squareArray[i]= new Square(true,squarePosition.getX(),squarePosition.getY(),"Y"+(i+1));
                squarePosition.left();
            }
        }else if(color.equals(Color.BLUE)){
            Position squarePosition = new Position(8, 14);
            for(int i=0;i<6;i++){
                squareArray[i]= new Square(true,squarePosition.getX(),squarePosition.getY(),"B"+(i+1));
                squarePosition.up();
            }
        }else if(color.equals(Color.RED)){
            Position squarePosition = new Position(2, 8);
            for(int i=0;i<6;i++){
                squareArray[i]= new Square(true,squarePosition.getX(),squarePosition.getY(),"R"+(i+1));
                squarePosition.right();
            }
        }
        return squareArray;
    }
}
