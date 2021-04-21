package Les_Petits_Chevaux.src;

import java.awt.*;
import java.util.Scanner;

public class Player {
    private String pseudo;
    private Team team;


    /* definition of the construct method*/ 

    Player(String pseudo, Color teamColor){
        this.pseudo = pseudo;
        this.team = new Team(teamColor);
    }

    /* definition of the default construct method*/
    Player(){
        this.pseudo = "john";
        this.team =new Team(Color.BLACK); 
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

    public void initPlayers(Player pl1,int nb){
        System.out.print("chose your nickname: ");
        String scra;
         Scanner sc = new Scanner( System.in ); 
             scra = sc.nextLine();
             pl1.setPseudo(scra);
             System.out.print(pl1.getPseudo());
            //CHANGER AVEC L4AFFICHAGE GRAPHIQUE
            
            
              switch(nb) {
                case 1:
                    pl1.setTeam(Color.RED);
                    System.out.print("You are in the RED team \n");
                    pl1.team.newPieces(Color.RED);
                  break;
                case 2:
                    pl1.setTeam(Color.BLUE); 
                    System.out.print("You are in the BLUE team \n");
                    pl1.team.newPieces(Color.BLUE);
                  break;
                case 3:
                    pl1.setTeam(Color.GREEN);
                    System.out.print("You are in the GREEN team \n");
                    pl1.team.newPieces(Color.GREEN);
                  break;
                case 4:
                    pl1.setTeam(Color.YELLOW);
                    System.out.print("You are in the YELLOW team \n");
                    pl1.team.newPieces(Color.YELLOW);

                default:
                  
                }
                System.out.print(pl1.getPseudo());
                System.out.print(pl1.getTeam().getTeamColor());
                sc=null;
            
            }
    }

    


