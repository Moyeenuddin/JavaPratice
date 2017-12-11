
package salesapptest;

import java.sql.*;


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
   
   
        //Class.forName("com.mysql.jdbc.Driver");

        //connection = DriverManager.getConnection(basePath+"://" +url+":"+port+"/"+dbName,user,password);
        //statement = connection.createStatement();

    
}
