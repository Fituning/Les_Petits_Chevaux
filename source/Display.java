package LudoGame.source;

/*import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Display extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}*/
/*import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;   
 
public class Display {  

public static void main(String[] args) { 



    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 

Random random = new Random();
int dice;
random = new Random();
dice = 1+random.nextInt(6);

            tf.setText("vous avez fait"+dice);  
        }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}*/


/*public class Display  extends JFrame {
  
  private static final long serialVersionUID = 1L;
  
  public Display(String titre) {
    super(titre);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    init();
  }
  
  private void init()
  {
    JLabel label = new JLabel(new ImageIcon("I:/Travail/java/vs/Ludo/Les_Petits_Chevaux/resources/Plateau_numero.png") );
    this.add(label, BorderLayout.CENTER);
    this.pack();    
  }
  
  public static void main(String[] args) {
    Display app = new Display("Afficher image");
    app.setVisible(true);
  }
}*/
