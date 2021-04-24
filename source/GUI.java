
package LudoGame.source;


import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
     
    public class GUI extends Application {
        
		
		
        @Override
	public void start(Stage primaryStage) {
		try {
			URL fxmlURL = getClass().getResource("../fxml/GameBoard.fxml");
			FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
			Node root = fxmlLoader.load();

			Scene scene = new Scene((StackPane) root, 620, 521
			);
			primaryStage.setScene(scene);
			primaryStage.setTitle("LudoGame");
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
