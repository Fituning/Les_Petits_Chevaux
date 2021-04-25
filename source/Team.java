
package LudoGame.source;

import java.awt.*;

public class Team {
    private Color teamColor;
    private int points;
    Piece[] piecesArray;


    /* definition of the construct method*/ 
    Team(Color teamColor){
        this.teamColor = teamColor;
        this.points = 0;
        //this.piecesArray = newPieces(teamColor);
    }

    /* player stters */

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPiecesArray(Piece[] piecesArray) {
        this.piecesArray = piecesArray;
    }

    public void setTeamColor(Color teamColor) {
        this.teamColor = teamColor;
    }

    /* player getters */

    public Piece[] getPieces() {
        return piecesArray;
    }
    public Piece getPieces(int number) {
        return piecesArray[number-1];
    }
    public Color getTeamColor() {
        return teamColor;
    }
    public int getPoints() {
        return points;
    }


    /* creation of an Array of Pieces */

    public Piece[] newPieces(Color teamColor, Square[] squareAr){
        Piece[] pieces = new Piece[4];
        /*declaration of the 4 new Pieces */
        for (int i=0;i<4;i++){

            pieces[i]=new Piece(teamColor,squareAr);
        }
        this.piecesArray=pieces;
        return pieces;
    }


    public boolean win(Player p1){
        int cmp=0;
        for(int i=0;i<4;i++){
            if(p1.getTeam().piecesArray[i].isPathCompleted()){
                cmp=cmp+1;
            }
        }
        if(cmp==4){
            return true;
        }
        else{
            return false;
        }

    }
}
