
package LudoGame.source;


import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
     
    public class GUI extends Application{ 
        
        @Override
	public void start(Stage primaryStage) {
		try {
			URL fxmlURL = getClass().getResource("../fxml/Menu.fxml");
			FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
			Node root = fxmlLoader.load();

			Scene scene = new Scene((Pane) root, 620, 521);
			primaryStage.setScene(scene);

			String url = new File( "" ).getAbsolutePath();
            primaryStage.getIcons().add(new Image("file:"+url+"/LudoGame/files/LogoIcon.png"));

			primaryStage.setTitle("WejLudo");
			primaryStage.centerOnScreen();
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
    public static void main(String[] args) {
    	launch(args);
    }
    
	
    }
