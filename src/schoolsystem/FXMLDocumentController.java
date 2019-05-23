/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

import Admin.StudentsData;
import AppLogin.AppLoginController;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import DBConnection.*;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableRow;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField id;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField email;
    @FXML
    private DatePicker dob;
    @FXML
    private Button addData;
    @FXML
    private Button loadData;
    @FXML
    public TableView<StudentsData> tableview;
    @FXML
    private TableColumn<StudentsData,String> Id;
    @FXML
    private TableColumn<StudentsData,String> Firstname;
    @FXML
    private TableColumn<StudentsData,String> Lastname;
    @FXML
    private TableColumn<StudentsData,String> Email;
    @FXML
    private TableColumn<StudentsData,String> Dob;
    private String SQL = "SELECT *FROM students";
    
    DBConnection con1=null; 
    Connection conn1;
    ResultSet rs =null;
    
    private ObservableList<StudentsData> data;
    TableRow<StudentsData> ta = new TableRow<>();
    
    
    
   
   
    
    
    
   
   
   
   
    
    
  
      
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           con1 = new DBConnection();
       
        
        
    }
@FXML
public void LoadData(ActionEvent event)throws SQLException{
     try {
            conn1 = this.con1.getConnection();
            this.rs = conn1.createStatement().executeQuery(SQL);
            this.data =FXCollections.observableArrayList();
            while(rs.next()){
                this.data.add(new StudentsData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                
            }
            
        } catch (SQLException e) { 
            System.err.print(e);
        }
     this.Id.setCellValueFactory(new PropertyValueFactory<StudentsData,String>("ID"));
     this.Firstname.setCellValueFactory(new PropertyValueFactory<StudentsData,String>("first_name"));
     this.Lastname.setCellValueFactory(new PropertyValueFactory<StudentsData,String>("last_name"));
     this.Dob.setCellValueFactory(new PropertyValueFactory<StudentsData,String>("dob"));
     this.Email.setCellValueFactory(new PropertyValueFactory<StudentsData,String>("email"));
     this.tableview.setItems(null);
     this.tableview.setItems(this.data);
     
    
    tableview.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
        public void handle(MouseEvent event){
            
            if (event.getClickCount()==2&&tableview.getSelectionModel().getSelectedItem()!=null) {
                try{
                    
                    
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                FXMLLoader lo=new FXMLLoader();
                Pane pane = (Pane)lo.load(getClass().getResource("/Update/Update.fxml"));
                Scene scene =new Scene(pane);
                stage.setScene(scene);
                stage.show();}catch(IOException e){
                System.err.print(e);
                    
                   
                    
                }
                
              
                
                
                
            }
            else{
               
                tableview.getSelectionModel().clearSelection();
            }
        }
    });
    
}

         
       
    
          
     
    
   
     
     
}
    

