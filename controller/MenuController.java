package LudoGame.controller;



import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button Gbtn , Bbtn , Rbtn, Ybtn;

    @FXML
    private TextField Gtext , Btext , Rtext ,Ytext;

    @FXML
    private Button StartBtn;

    private String GName ;
    private String BName ;
    private String RName ;
    private String YName ;

    @FXML
    void newYName(ActionEvent event) {
        YName = Ytext.getText();
    }

    @FXML
    void newRName(ActionEvent event) {
        RName = Rtext.getText();
    }

    @FXML
    void newGName(ActionEvent event) {
        GName = Gtext.getText();
    }

    @FXML
    void newBName(ActionEvent event) {
        BName = Btext.getText();
    }

    @FXML
    void GameBoard(ActionEvent event) {
        getRName();
        
        getBName();
        
        getGName();
        
        getYName();
        
        
        if(GName != null && BName != null && RName != null && YName != null){
            try {
                URL fxmlURL = getClass().getResource("../fxml/GameBoard.fxml");
                FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
                Parent root = fxmlLoader.load();

                GameBoardController game = fxmlLoader.getController();
                game.initializePseudo(RName, BName, GName, YName);

                Stage stage = new Stage();

                stage.setResizable(false);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("LudoGame");

                String url = new File( "" ).getAbsolutePath();
                stage.getIcons().add(new Image("file:"+url+"/LudoGame/files/LogoIcon.png"));

                stage.setScene(new Scene((StackPane) root, 597, 510));
                stage.showAndWait();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            if(RName== null){
                Rtext.setPromptText("please enter a Gamer Tag");
                Rtext.setStyle("-fx-prompt-text-fill: #a01010");
            }
            if(BName== null){
                Btext.setPromptText("please enter a Gamer Tag");
                Btext.setStyle("-fx-prompt-text-fill: #a01010");
            }
            if(GName== null){
                Gtext.setPromptText("please enter a Gamer Tag");
                Gtext.setStyle("-fx-prompt-text-fill: #a01010");
            }
            if(YName== null){
                Ytext.setPromptText("please enter a Gamer Tag");
                Ytext.setStyle("-fx-prompt-text-fill: #a01010");
            }
        }
    }

    public void getRName(){
        RName = Rtext.getText();
    }
    public void getBName(){
        BName = Btext.getText();
    }
    public void getGName(){
        GName = Gtext.getText();
    }
    public void getYName(){
        YName = Ytext.getText();
    }
}
