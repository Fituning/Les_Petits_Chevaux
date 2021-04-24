package LudoGame.controller;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GameBoardController {

    @FXML
    private ImageView PieceG1;

    @FXML
    private Button btnG1;
    
    @FXML
    void MovePiece(ActionEvent event) {
        int x,y;
        System.out.println(event.getSource().toString());
        x = GridPane.getColumnIndex(btnG1);
        y = GridPane.getRowIndex(btnG1);
        y++;
        GridPane.setConstraints(btnG1, x, y);
        GridPane.setConstraints(PieceG1, x, y);
    }

    @FXML
    private Button DiceButton;
    @FXML
    private ImageView diceView;

    @FXML
    void throwDice(ActionEvent event) {
        System.out.println(diceView.getImage().getUrl());
        Random random = new Random();
        int dice;
        dice = 1+random.nextInt(6);
        
        switch (dice) {
            case 1:
                
                diceView.setImage(new Image("file:@../files/De1.png"));
                break;
            case 2:
                diceView.setImage(new Image("file:../LudoGame/files/De2.png"));
                break;
            case 3:
                diceView.setImage(new Image("file:../LudoGame/files/De3.png"));
                break;
            case 4:
                diceView.setImage(new Image("file:../LudoGame/files/De4.png"));
                break;
            case 5:
                diceView.setImage(new Image("file:../LudoGame/files/De5.png"));
                break;
            case 6:
                diceView.setImage(new Image("file:../LudoGame/files/De6.png"));
                break;
            default:
                break;
        }
        System.out.println("do");
    }

}
