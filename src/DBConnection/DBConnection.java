/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    private static final String USERNAME = "kunal";
    private static final String PASSWORD = "Palwarkunal";
    private static final String Conn = "jdbc:mysql://localhost/school";
    
    static Connection co=null;
    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(Conn,USERNAME,PASSWORD);
        } catch (Exception e) {
            return co;
        }
        
       
        
    
}}
        