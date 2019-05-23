

package AppLogin;
import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    Connection conn;

    public LoginModel() {
        
        try {
            conn = DBConnection.getConnection();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        if (this.conn==null) {
//            System.exit(1);
//        }
        
    }
    public boolean IsDatabaseConnected(){
        return this.conn!=null;
    }
    public boolean IsLogin(String username, String password, String opt) throws SQLException{
        
           
           PreparedStatement stmt =null;
        ResultSet rs= null;
        
      String SQL = "SELECT *FROM login where username=? and password=? and opt=?";
      try{
      stmt = this.conn.prepareStatement(SQL);
      stmt.setString(1,username);
      stmt.setString(2, password);
      stmt.setString(3,opt);
      
      rs =stmt.executeQuery();
     
        if (rs.next()) {
            return true;
            
        }
        return false;
       }catch(SQLException e){
         return false;
       }
      finally{
           
            stmt.close();
            rs.close();
               }
      
        
    }
   
    
}
