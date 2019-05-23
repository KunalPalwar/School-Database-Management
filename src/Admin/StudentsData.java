
package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class StudentsData {
//    private final StringProperty ID;
//    private final StringProperty first_name;
//    private final StringProperty last_name;
//    private final StringProperty dob;
//    private final StringProperty email;
    //private String fee;
       private String ID;
    private  String first_name;
    private  String last_name;
    private  String dob;
    private String email;
    
   
    public StudentsData(String id,String firstname,String lastname, String dob,String email){
//    this.ID =new SimpleStringProperty(id);
//    this.first_name = new SimpleStringProperty(firstname);
//    this.last_name = new SimpleStringProperty(lastname);
//    this.dob = new SimpleStringProperty(dob);
//    this.email = new SimpleStringProperty(email);
    //this.fee = fee;
    this.ID =(id);
    this.first_name =(firstname);
    this.last_name = (lastname);
    this.dob = (dob);
    this.email = (email);
    
    
    }
    
   
//    public String getID(){
//        return ID.get();
//    }
//    public StringProperty IDProperty(){
//        return ID;
//    }
//    public void setID(String id){
//        this.ID.set(id);
//        
//    }
// public String getfirst_name(){
//        return first_name.get();
//    }
//    public StringProperty first_nameProperty(){
//        return first_name;
//    }
//    public void setfirst_name(String firstname){
//        this.first_name.set(firstname);
//        
//    }
//     public String getlast_name(){
//        return last_name.get();
//    }
//    public StringProperty last_nameProperty(){
//        return last_name;
//    }
//    public void setlast_name(String lastname){
//        this.last_name.set(lastname);
//        
//    }
//     public String getdob(){
//        return dob.get();
//    }
//    public StringProperty dobProperty(){
//        return dob;
//    }
//    public void setdob(String dob){
//        this.dob.set(dob);
//        
//    }
//     public String getemail(){
//        return email.get();
//    }
//    public StringProperty emailProperty(){
//        return email;
//    }
//    public void setemail(String email){
//        this.email.set(email);
//        
//    }
//    

    public String getID() {
        return ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
     public void setID(String id)
    {
        this.ID = id;
    }
      public void setfirst_name(String firstname)
    {
        this.first_name = firstname;
    }
       public void setlast_name(String lastname)
    {
        this.last_name = lastname;
    }
        public void setdob(String dob)
    {
        this.dob = dob;
        
    }
    

  
    
    
    
}
