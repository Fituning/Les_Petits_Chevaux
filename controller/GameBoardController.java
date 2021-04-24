package LudoGame.controller;

import java.io.File;
import java.util.Random;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GameBoardController {


    @FXML
    private Button G1;

    @FXML
    private Button G2;

    @FXML
    private Button G3;

    @FXML
    private Button G4;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    String turn = new String("G");
    
    @FXML
    void MovePiece(ActionEvent event) {
        if(this.turn.equals("G")){
            System.out.println(turn);
            G1.setDisable(true);
            G2.setDisable(true);
            G3.setDisable(true);
            G4.setDisable(true);
        }else{
            B1.setDisable(true);
            B2.setDisable(true);
            B3.setDisable(true);
            B4.setDisable(true);
        }

        int x,y;
        System.out.println(event.getSource().toString());
        x = GridPane.getColumnIndex(G1);
        y = GridPane.getRowIndex(G1);
        y++;
        GridPane.setConstraints(G1, x, y);

        if(this.turn.equals("G")){
            this.turn = "B";
            B1.setDisable(false);
            B2.setDisable(false);
            B3.setDisable(false);
            B4.setDisable(false);
            G4.toBack();
            G3.toBack();
            G2.toBack();
            G4.toBack();
            
        }else{
            this.turn = "G";
            G1.setDisable(false);
            G2.setDisable(false);
            G3.setDisable(false);
            G4.setDisable(false);
            B4.toBack();
            B3.toBack();
            B2.toBack();
            B1.toBack();
            
        }
    }

    @FXML
    private Button DiceButton;
    @FXML
    private ImageView diceView;

    @FXML
    int throwDice(ActionEvent event) {
        Random random = new Random();
        int dice;
        dice = 1+random.nextInt(6);
        String url = new File( "" ).getAbsolutePath();
        
        switch (dice) {
            case 1:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De1.png"));
                break;
            case 2:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De2.png"));
                break;
            case 3:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De3.png"));
                break;
            case 4:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De4.png"));
                break;
            case 5:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De5.png"));
                break;
            case 6:
                diceView.setImage(new Image("file:"+url+"/LudoGame/files/De6.png"));
                break;
            default:
                break;
        }
        System.out.println(dice);
        return dice;
    }

}
