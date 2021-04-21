package Les_Petits_Chevaux.src;

import java.awt.*;

public class Team {
    private Color teamColor;
    private int points;
    Piece[] piecesArray;


    /* definition of the construct method*/ 
    Team(Color teamColor){
        this.teamColor = teamColor;
        this.points = 0;
        this.piecesArray = newPieces(teamColor);
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
    public Color getTeamColor() {
        return teamColor;
    }
    public int getPoints() {
        return points;
    }


    /* creation of an Array of Pieces */

    public Piece[] newPieces(Color teamColor){
        Piece[] pieces = new Piece[4];
        /*declaration of the 4 new Pieces */
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
