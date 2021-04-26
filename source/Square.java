
package LudoGame.source;


import java.util.ArrayList;
import java.util.List;



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

	
	//works
	  public void comparePiecePosition(Piece p1, Square[] sq){
			 int lim = sq[p1.getPiecePath().getPathPosition()].getPieceIn().size();
				if(sq[p1.getPiecePath().getPathPosition()].getPieceIn()!=null){
					
					for (int i=0;i<lim;i++) {
						{
							if(sq[p1.getPiecePath().getPathPosition()].isSafeZone()==false && sq[p1.getPiecePath().getPathPosition()].getPieceIn().get(i).getColor()!=p1.getColor()) {
								System.out.print("le pion returne a sa maison ! \n ");
								 p1.getPiecePath().setPathPosition(p1.getPiecePath().getPathPosition()-p1.getPiecePath().getPathPosition());
								 System.out.print("LE PION EST MAITENANT SUR LA CASE :"+ p1.getPieceSquare(p1.getPiecePath().getPathPosition()).getSquareNumber()+"\n");
								p1.getPiecePath().setInPist(false);

						}
							else {
								System.out.print("rien \n");
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

	public void addPieceIn(Piece p) {
		this.pieceIn.add(p);
	}

	public void removePieceIn(Piece p) {
		this.pieceIn.remove(p);
	}


	public String getSquareNumber() {
		return squareNumber;
		}
	public Position getSquarePosition(){
		return squarePosition;
	}


	public void setSquareNumber(String squareNumber) {
		this.squareNumber = squareNumber;
		}


	@Override
    public String toString() {
        return "Square Name : " + squareNumber + " , en x = " + squarePosition.getX()+" et y = " + squarePosition.getY()+". Is in safe zone " + safeZone;
    }
}