
package DBConnect;

import java.sql.*;


public class DBConnect {
    
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    String basePath = "jdbc:mysql";
    String url = "localhost";
    String port = "3306";
    String dbName = "salesapp";
    String user = "root";
    String password = "";
    
       
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
         
            connection = DriverManager.getConnection(basePath+"://" +url+":"+port+"/"+dbName,user,"");
            statement = connection.createStatement();
        
        }catch(Exception ex){
            System.out.println("Error: "+ex);
            
        }
    }
    
    public void getData() {
        try{
            String query = "select * from sales";
            resultset = statement.executeQuery(query);
            System.out.println("Record from Database");
            while(resultset.next()){
                String SalesID= resultset.getString ("SalesID");
                String productName= resultset.getString ("ProductName");
                String Price= resultset.getString ("Price");
                String Quantity= resultset.getString ("Quantity");
                System.out.println("Sales ID: "+SalesID+"   product Name: "+productName+"   Price: "+Price+"    Quantity : "+Quantity);
                 
            }
            
        }catch(Exception ex){
           System.out.println("Error: "+ex); 
        }
}
    
}