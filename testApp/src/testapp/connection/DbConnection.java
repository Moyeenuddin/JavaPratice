/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbConnection {
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    String basePath = "jdbc:mysql";
    String url = "localhost";
    String port = "3306";
    String dbName = "salesapp";
    String user = "root";
    String password = "";
    
    public Connection connect(){
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection(basePath+"://" +url+":"+port+"/"+dbName,user,"");
          statement = connection.createStatement(); 
       
        }catch(Exception ex){
            System.out.println("Error: "+ex);            
        }
        return connection;
    }
    
    public void disconnect(){
        
    }

        
}
