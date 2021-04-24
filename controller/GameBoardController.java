package LudoGame.controller;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import LudoGame.source.*;
import LudoGame.source.SquareArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GameBoardController extends SquareArray implements Initializable{


    @FXML
    private Button G1, G2, G3, G4;
    @FXML
    private Button B1, B2, B3, B4;
    @FXML
    private Button R1, R2, R3, R4;
    @FXML
    private Button Y1, Y2, Y3, Y4;

    @FXML
    private Label playerTurn;

    private String turn = new String("G");
    private int dice;

    private Player player1=new Player();
    private Player player2=new Player();
    private Player player3=new Player();
    private Player player4=new Player();

    @Override
    public void initialize(URL location, ResourceBundle resources){
        Square[] squareArray = new Square[57];
        squareArray=initSquares();
        
        player1.initPlayers(player1,1,squareArray);
        player2.initPlayers(player2,2,squareArray);
        player3.initPlayers(player3,3,squareArray);
        player4.initPlayers(player4,4,squareArray);

        Random random = new Random();
        int start;
        start = 1+random.nextInt(4);

        switch (start) {
            case 1:
                turn = "G";
                playerTurn.setStyle("-fx-background-color: #a7ec1c");
                playerTurn.setText("G");
                break;
            case 2:
                turn = "R";
                playerTurn.setStyle("-fx-background-color: #cc0000");
                playerTurn.setText("R");
                break;
            case 3:
                turn = "B";
                playerTurn.setStyle("-fx-background-color: #7827bb");
                playerTurn.setText("V");
                break;
            case 4:
                turn = "Y";
                playerTurn.setStyle("-fx-background-color: #eaf517");
                playerTurn.setText("Y");
                break;
            default:
                break;
        }
    }
    
    @FXML
    void MovePiece(ActionEvent event) {
        if(this.turn.equals("G")){
            G1.setDisable(true);
            G2.setDisable(true);
            G3.setDisable(true);
            G4.setDisable(true);
            G4.toBack();
            G3.toBack();
            G2.toBack();
            G4.toBack();
        }else if(this.turn.equals("B")){
            B1.setDisable(true);
            B2.setDisable(true);
            B3.setDisable(true);
            B4.setDisable(true);
            B4.toBack();
            B3.toBack();
            B2.toBack();
            B4.toBack();
        }else if(this.turn.equals("R")){
            R1.setDisable(true);
            R2.setDisable(true);
            R3.setDisable(true);
            R4.setDisable(true);
            R4.toBack();
            R3.toBack();
            R2.toBack();
            R4.toBack();
        }else if(this.turn.equals("Y")){
            Y1.setDisable(true);
            Y2.setDisable(true);
            Y3.setDisable(true);
            Y4.setDisable(true);
            Y4.toBack();
            Y3.toBack();
            Y2.toBack();
            Y4.toBack();
        }

        String piece = new String(event.toString().split("'")[1]);
        int x,y;
        System.out.println(piece);
        switch (piece) {
            case "G1":
                x = GridPane.getColumnIndex(G1);
                y = GridPane.getRowIndex(G1);
                y++;
                GridPane.setConstraints(G1, x, y);
                break;
            case "G2":
            x = GridPane.getColumnIndex(G2);
            y = GridPane.getRowIndex(G2);
            y++;
            GridPane.setConstraints(G2, x, y);
                break;
            case "G3":
            x = GridPane.getColumnIndex(G3);
            y = GridPane.getRowIndex(G3);
            y++;
            GridPane.setConstraints(G3, x, y);
                break;
            case "G4":
            x = GridPane.getColumnIndex(G4);
            y = GridPane.getRowIndex(G4);
            y++;
            GridPane.setConstraints(G4, x, y);
                break;
            case "B1":
            x = GridPane.getColumnIndex(B1);
            y = GridPane.getRowIndex(B1);
            y++;
            GridPane.setConstraints(B1, x, y);
                break;
            case "B2":
            x = GridPane.getColumnIndex(B2);
            y = GridPane.getRowIndex(B2);
            y++;
            GridPane.setConstraints(B2, x, y);
                break;
            case "B3":
            x = GridPane.getColumnIndex(B3);
            y = GridPane.getRowIndex(B3);
            y++;
            GridPane.setConstraints(B3, x, y);
                break;
            case "B4":
            x = GridPane.getColumnIndex(B4);
            y = GridPane.getRowIndex(B4);
            y++;
            GridPane.setConstraints(B4, x, y);
                break;
        
            default:
                break;
        }

        nextPlayer();
        DiceButton.setDisable(false);
    }

    @FXML
    private Button DiceButton;
    @FXML
    private ImageView diceView;

    @FXML
    void throwDice(ActionEvent event) {
        int exit=0;
        Random random = new Random();
        this.dice = 1+random.nextInt(6);
        String url = new File( "" ).getAbsolutePath();
        
        for(int i=1;i<7;i++){
           /*essay D'animation*/
            diceView.setImage(new Image("file:"+url+"/LudoGame/files/De"+i+".png"));
        }
        switch (this.dice) {
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
        DiceButton.setDisable(true);
        if(this.turn.equals("B")){
            exit+=enable(B1);
            exit+=enable(B2);
            exit+=enable(B3);
            exit+=enable(B4);
        }else if(this.turn.equals("G")){
            exit+=enable(G1);
            exit+=enable(G2);
            exit+=enable(G3);
            exit+=enable(G4);
        }else if(this.turn.equals("R")){
            exit+=enable(R1);
            exit+=enable(R2);
            exit+=enable(R3);
            exit+=enable(R4);
        }else if(this.turn.equals("Y")){
            exit+=enable(Y1);
            exit+=enable(Y2);
            exit+=enable(Y3);
            exit+=enable(Y4);
        }

        if(exit==4){
            DiceButton.setDisable(false);
            nextPlayer();
        }
    }

    public int enable(Button btn){
        if(dice == 6){
            btn.setDisable(false);
            return 0;
        }else{
            return 1;
        }
    }

    public void nextPlayer(){
        if(this.turn.equals("G")){
            this.turn = "R";
            playerTurn.setStyle("-fx-background-color: #cc0000");
            playerTurn.setText("R");   
        }else if(this.turn.equals("R")){
            this.turn = "B";
            playerTurn.setStyle("-fx-background-color: #7827bb");
            playerTurn.setText("V");
        }else if(this.turn.equals("B")){
            this.turn = "Y";
            playerTurn.setStyle("-fx-background-color: #eaf517");
            playerTurn.setText("Y");
        }else if(this.turn.equals("Y")){
            this.turn = "G";
            playerTurn.setStyle("-fx-background-color: #a7ec1c");
            playerTurn.setText("G");
        }
    }

}
