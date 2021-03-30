package Les_Petits_Chevaux.src;

import java.awt.*;

public class Player {
    private String pseudo;
    private Team team;


    /* definition of the construct method*/ 

    Player(String pseudo, Color teamColor){
        this.pseudo = pseudo;
        this.team = new Team(teamColor);
    }

    /* player setters */

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setTeam(Color teamColor) {
        this.team = new Team(teamColor);
    }

    /* player getters */

    public String getPseudo() {
        return pseudo;
    }

    public Team getTeam() {
        return team;
    }

}

