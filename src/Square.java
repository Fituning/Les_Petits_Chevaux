package Les_Petits_Chevaux.src;

import java.util.ArrayList;
import java.util.List;

import Les_Petits_Chevaux.Piece;
import Les_Petits_Chevaux.Position;
import Les_Petits_Chevaux.Square;

public class Square {
    private String squareNumber;
    private Position squarePosition;
    private boolean safeZone;
    private List<Piece> pieceIn = new ArrayList<Piece>();

  



	public Square(boolean safeZone,int x, int y,String square){
        this.safeZone = safeZone ;
        this.squarePosition = new Position(x, y);
        this.squareNumber = square;
    }
	public Square(boolean safeZone,Position position,String square){
		this.safeZone = safeZone ;
        this.squarePosition = position;
        this.squareNumber = square;
	}

	
	public void occupationActualizer(Piece p2, Square[] sq) {
		
		
	}
	
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
	

	public List<Piece> getPieceIn() {
		return pieceIn;
	}


	public boolean isSafeZone() {
		return safeZone;
	}


	public void setPieceIn(List<Piece> pieceIn) {
		this.pieceIn = pieceIn;
	}

	public int getSquareNumber() {
		return squareNumber;
		}


	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
		}


	@Override
    public String toString() {
        return "Square Name : " + squareNumber + " , en x = " + squarePosition.getX()+" et y = " + squarePosition.getY()+". Is in safe zone " + safeZone;
    }
}
