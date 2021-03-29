package Les_Petits_Chevaux.src;

import java.awt.*;

public class Player {
    private String pseudo;
    private Color teamColor;
    private int points;
    private Piece[] piecesArray;


    /* definition of the construct method*/ 
    Player(String pseudo, Color teamColor){
        this.pseudo = pseudo;
        this.teamColor = teamColor;
        this.points = 0;
        this.piecesArray = newPieces(teamColor);
    }

    /* player stters */

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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
    public String getPseudo() {
        return pseudo;
    }


    /* creation of an Array of Pieces */

    private Piece[] newPieces(Color teamColor){
        Piece[] pieces = new Piece[4];
        /*declaration of the 4 new Pieces */
        return pieces;
    }

}

