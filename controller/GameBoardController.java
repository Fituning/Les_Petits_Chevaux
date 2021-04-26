package LudoGame.controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    private ImageView winG, winB, winR, winY;

    @FXML
    private Label playerTurn;

    private String turn = new String("G");
    private int dice;
    private boolean replay = false;
    private int nbWinner=0;

    private Player playerR=new Player();
    private Player playerB=new Player();
    private Player playerG=new Player();
    private Player playerY=new Player();


    @Override
    public void initialize(URL location, ResourceBundle resources){
        Square[] squareArray = new Square[57];
        squareArray=initSquares();
        
        playerR.initPlayers(playerR,1,squareArray);
        playerB.initPlayers(playerB,2,squareArray);
        playerG.initPlayers(playerG,3,squareArray);
        playerY.initPlayers(playerY,4,squareArray);


        Button btnArray[] ={R1,R2,R3,R4,B1,B2,B3,B4,G1,G2,G3,G4,Y1,Y2,Y3,Y4};
        initStartPosition(btnArray);

        Random random = new Random();
        int start;
        start = 1+random.nextInt(4);

        switch (start) {
            case 1:
                turn = "G";
                playerTurn.setStyle("-fx-background-color: #a7ec1c");
                playerTurn.setText("G\nturn");
                break;
            case 2:
                turn = "R";
                playerTurn.setStyle("-fx-background-color: #cc0000");
                playerTurn.setText("R\nturn");
                break;
            case 3:
                turn = "B";
                playerTurn.setStyle("-fx-background-color: #7827bb");
                playerTurn.setText("B\nturn");
                break;
            case 4:
                turn = "Y";
                playerTurn.setStyle("-fx-background-color: #eaf517");
                playerTurn.setText("Y\nturn");
                break;
            default:
                break;
        }
    }

    public void initializePseudo(String p1, String p2,String p3 ,String p4){
        playerR.setPseudo(p1);
        playerB.setPseudo(p2);
        playerG.setPseudo(p3);
        playerY.setPseudo(p4);
    }
    
    public void initStartPosition(Button[] buttonArray){
        int x,y;
        for(int i=0 ;i<16;i++){
            x = GridPane.getColumnIndex(buttonArray[i]);
            y = GridPane.getRowIndex(buttonArray[i]);
            witchPiece(buttonArray[i]).setInitPosition(x, y);
        }
    }

    @FXML
    void MovePiece(ActionEvent event) {
        
        List<Piece> pieceIn = new ArrayList<Piece>();
        String piece = new String(event.toString().split("'")[1]);
        int x,y;

        if(witchPiece(getButton(piece)).getPiecePath().isInPist()==false){
            witchPiece(getButton(piece)).getPiecePath().setInPist(true);
            x = witchPiece(getButton(piece)).getPiecePath().getSquare().getSquarePosition().getX();
            y = witchPiece(getButton(piece)).getPiecePath().getSquare().getSquarePosition().getY();
            GridPane.setConstraints(getButton(piece), x, y);
            witchPiece(getButton(piece)).getPiecePath().getSquare().addPieceIn(witchPiece(getButton(piece)));
        }else{
            witchPiece(getButton(piece)).getPiecePath().getSquare().removePieceIn(witchPiece(getButton(piece)));
            witchPiece(getButton(piece)).setCurrentPosition(dice);
            x = witchPiece(getButton(piece)).getPiecePath().getSquare().getSquarePosition().getX();
            y = witchPiece(getButton(piece)).getPiecePath().getSquare().getSquarePosition().getY();
            GridPane.setConstraints(getButton(piece), x, y);
            witchPiece(getButton(piece)).isPathCompleted();
            

            if(witchPiece(getButton(piece)).getPiecePath().getSquare().isSafeZone()==false){
                pieceIn = witchPiece(getButton(piece)).getPiecePath().getSquare().getPieceIn();
                if(pieceIn.size() >0){
                    for(Piece n : pieceIn){
                        if(n.getColorName().equals(this.turn)== false){
                            x = n.getInitPosition().getX();
                            y = n.getInitPosition().getY();
                            n.setPiecePosition(0);
                            n.getPiecePath().setInPist(false);
                            GridPane.setConstraints(witchButton(n), x, y);
                        }
                    }
                }
            }

            witchPiece(getButton(piece)).getPiecePath().getSquare().addPieceIn(witchPiece(getButton(piece)));
        }
        
        if(this.turn.equals("G")){
            disable(G1, G2, G3, G4);
            playerG.getTeam().setWin();
            if(playerG.getTeam().haveWin() == true){
                enableWin(winG);
            }
        }else if(this.turn.equals("B")){
            disable(B1, B2, B3, B4);
            playerB.getTeam().setWin();
            if(playerB.getTeam().haveWin() == true){
                enableWin(winB);
            }
        }else if(this.turn.equals("R")){
            disable(R1, R2, R3, R4);
            playerR.getTeam().setWin();
            if(playerR.getTeam().haveWin() == true){
                enableWin(winR);
            }
        }else if(this.turn.equals("Y")){
            disable(Y1, Y2, Y3, Y4);
            playerY.getTeam().setWin();
            if(playerY.getTeam().haveWin() == true){
                enableWin(winY);
            }
        }
        
        if(dice == 6 && replay == false){
            DiceButton.setDisable(false);
            replay = true;
        }else if(witchPiece(getButton(piece)).isPathCompleted()==true && replay == false){
            DiceButton.setDisable(false);
            replay = true;
        }else{
            replay = false;
            nextPlayer();
            DiceButton.setDisable(false);
        }
        if(this.nbWinner >= 3){
            DiceButton.setDisable(true);
            playerTurn.setStyle("-fx-background-color: black");
            playerTurn.setTextFill(Color.WHITE);
            playerTurn.setText("END");
        }
        
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
        if(witchPiece(btn).getPiecePath().isInPist()==false && dice == 6){
            btn.setDisable(false);
            return 0;
        }else if(witchPiece(btn).getPiecePath().isInPist()==true && witchPiece(btn).canBePlayed( this.dice) == true){
            btn.setDisable(false);
            return 0;
        }else{
            return 1;
        }
    }

    public void disable(Button b1, Button b2, Button b3, Button b4){
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b4.toBack();
        b3.toBack();
        b2.toBack();
        b1.toBack();
    }

    public void enableWin(ImageView colorView){
        String url = new File( "" ).getAbsolutePath();
        switch (this.nbWinner) {
            case 0:
                colorView.setImage(new Image("file:"+url+"/LudoGame/files/Couronne1.png"));
                break;
            case 1:
                colorView.setImage(new Image("file:"+url+"/LudoGame/files/Couronne2.png"));
                break;
            case 2:
                colorView.setImage(new Image("file:"+url+"/LudoGame/files/Couronne3.png"));
                break;
        }
        System.out.println("WIN"+colorView);
        this.nbWinner++;
    }

    public void nextPlayer(){

        if(this.turn.equals("G")){
            this.turn = "R";
            if(playerR.getTeam().haveWin()){
                nextPlayer();
            }else{
                playerTurn.setStyle("-fx-background-color: #cc0000");
                playerTurn.setText(playerR.getPseudo()+"\nturn");
            } 
        }else if(this.turn.equals("R")){
            this.turn = "B";
            if(playerB.getTeam().haveWin()){
                nextPlayer();
            }else{
                playerTurn.setStyle("-fx-background-color: #7827bb");
                playerTurn.setText(playerB.getPseudo()+"\nturn");
            }
        }else if(this.turn.equals("B")){
            this.turn = "Y";
            if(playerY.getTeam().haveWin()){
                nextPlayer();
            }else{
                playerTurn.setStyle("-fx-background-color: #eaf517");
                playerTurn.setText(playerY.getPseudo()+"\nturn");
            }
        }else if(this.turn.equals("Y")){
            this.turn = "G";
            if(playerG.getTeam().haveWin()){
                nextPlayer();
            }else{
                playerTurn.setStyle("-fx-background-color: #a7ec1c");
                playerTurn.setText(playerG.getPseudo()+"\nturn");
            }
        }
    }

    public Piece witchPiece(Button btn){
        if(btn.equals(B1)){
            return playerB.getTeam().getPieces(1);
        }else if(btn.equals(B2)){
            return playerB.getTeam().getPieces(2);
        }else if(btn.equals(B3)){
            return playerB.getTeam().getPieces(3);
        }else if(btn.equals(B4)){
            return playerB.getTeam().getPieces(4);
        }else if(btn.equals(R1)){
            return playerR.getTeam().getPieces(1);
        }else if(btn.equals(R2)){
            return playerR.getTeam().getPieces(2);
        }else if(btn.equals(R3)){
            return playerR.getTeam().getPieces(3);
        }else if(btn.equals(R4)){
            return playerR.getTeam().getPieces(4);
        }else if(btn.equals(G1)){
            return playerG.getTeam().getPieces(1);
        }else if(btn.equals(G2)){
            return playerG.getTeam().getPieces(2);
        }else if(btn.equals(G3)){
            return playerG.getTeam().getPieces(3);
        }else if(btn.equals(G4)){
            return playerG.getTeam().getPieces(4);
        }else if(btn.equals(Y1)){
            return playerY.getTeam().getPieces(1);
        }else if(btn.equals(Y2)){
            return playerY.getTeam().getPieces(2);
        }else if(btn.equals(Y3)){
            return playerY.getTeam().getPieces(3);
        }else if(btn.equals(Y4)){
            return playerY.getTeam().getPieces(4);
        }else{
            return null;
        }
    }

    public Button witchButton(Piece p){
        if(p.equals(playerB.getTeam().getPieces(1))){
            return B1;
        }else if(p.equals(playerB.getTeam().getPieces(2))){
            return B2;
        }else if(p.equals(playerB.getTeam().getPieces(3))){
            return B3;
        }else if(p.equals(playerB.getTeam().getPieces(4))){
            return B4;
        }else if(p.equals(playerR.getTeam().getPieces(1))){
            return R1;
        }else if(p.equals(playerR.getTeam().getPieces(2))){
            return R2;
        }else if(p.equals(playerR.getTeam().getPieces(3))){
            return R3;
        }else if(p.equals(playerR.getTeam().getPieces(4))){
            return R4;
        }else if(p.equals(playerG.getTeam().getPieces(1))){
            return G1;
        }else if(p.equals(playerG.getTeam().getPieces(2))){
            return G2;
        }else if(p.equals(playerG.getTeam().getPieces(3))){
            return G3;
        }else if(p.equals(playerG.getTeam().getPieces(4))){
            return G4;
        }else if(p.equals(playerY.getTeam().getPieces(1))){
            return Y1;
        }else if(p.equals(playerY.getTeam().getPieces(2))){
            return Y2;
        }else if(p.equals(playerY.getTeam().getPieces(3))){
            return Y3;
        }else if(p.equals(playerY.getTeam().getPieces(4))){
            return Y4;
        }else{
            return null;
        }
    }

    public Button getButton(String btnName){
        switch (btnName){
            case "G1":
                return G1;
            case "G2":
                return G2;
            case "G3":
                return G3;
            case "G4":
                return G4;
                
            case "B1":
                return B1;
            case "B2":
                return B2;
            case "B3":
                return B3;
            case "B4":
                return B4;
            
            case "R1":
                return R1;
            case "R2":
                return R2;
            case "R3":
                return R3;
            case "R4":
                return R4;

            case "Y1":
                return Y1;
            case "Y2":
                return Y2;
            case "Y3":
                return Y3;
            case "Y4":
                return Y4;
            default:
                return null;
                
        }
    }

}
