
package AppLogin;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AppLoginController implements Initializable {
    LoginModel model = new LoginModel();
   @FXML
   private Label Status;
   @FXML
   private TextField username;
   @FXML
   private TextField password;
   @FXML
   private ComboBox<option> combobox;
   @FXML
   private Button loginbutton;
   @FXML
   private Label loginStatus;
   public static Stage prime;
   
    
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        if (this.model.IsDatabaseConnected()) {
            Status.setText("Connected To Database");
            
        }
        else
        {
            Status.setText("Not Connected To Database");
                 
        }
        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
          
        
        
        
    }
    @FXML
    public void Login(ActionEvent event) throws SQLException{
        try {
         if (this.model.IsLogin(this.username.getText(), this.password.getText(),((option)this.combobox.getValue()).toString())){
             Stage stage = (Stage)this.loginbutton.getScene().getWindow();
             stage.close();
             switch(((option)this.combobox.getValue()).toString()){
                 case "Admin":
                     admin();
                     break;
                 case "Student":
                     students();
                     break;
             }                    
             
        }
         else
         {
             this.loginStatus.setText("**/SHIDI LUND HO AAP/**");
             
         }
        }catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
        
            
        
        
    
    public void students() {
        try {
            
            
        prime = new Stage();
        FXMLLoader fx= new FXMLLoader();
        
        Pane pane = (Pane)fx.load(getClass().getResource("/schoolsystem/FXMLDocument.fxml").openStream());
        Scene scene =new Scene(pane);
        prime.setScene(scene);
        prime.setResizable(false);
        
        prime.show();
       
        
        
        
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        
        
    }
    public void admin(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane)loader.load(getClass().getResource("/Admin/AdminFXML.fxml").openStream());
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
        
        
        
    }    
    

