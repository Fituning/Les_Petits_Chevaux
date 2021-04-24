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
    
    @FXML
    void MovePiece(ActionEvent event) {
        int x,y;
        System.out.println(event.getSource().toString());
        x = GridPane.getColumnIndex(G1);
        y = GridPane.getRowIndex(G1);
        y++;
        GridPane.setConstraints(G1, x, y);
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
