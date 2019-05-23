
package AppLogin;

import java.io.IOException;
import java.rmi.server.RMIClassLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppLogin extends Application{
   public void start(Stage stage) throws Exception{
   Parent root = (Parent)FXMLLoader.load(getClass().getResource("AppLogin.fxml"));
   Scene scene = new Scene(root);
   stage.setScene(scene);
   stage.setResizable(false);
   stage.show();
   
   }
   public static void main(String [] args){
       launch(args);
   }
    
    
    
    
}
