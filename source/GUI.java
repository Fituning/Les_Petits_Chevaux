
package LudoGame.source;


<<<<<<< HEAD

=======
>>>>>>> e1497660a1dd488edcc857528f2bdce6bed42e09
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
    import javafx.scene.Scene;
import javafx.scene.image.ImageView;
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
			primaryStage.setTitle("Claiwatin");
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
