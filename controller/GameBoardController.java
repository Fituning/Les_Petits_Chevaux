package LudoGame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class GameBoardController {

    @FXML
    private ImageView PieceG1;

    @FXML
    private Button btnG1;
    
    @FXML
    void MovePiece(ActionEvent event) {
        System.out.println(event.getSource().toString());
        if(event.equals(btnG1)){
            System.out.println("work");
        }else{
            System.out.println(event.equals(btnG1));
        }
    }

}
