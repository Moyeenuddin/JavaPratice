
package service;

import entity.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import testapp.connection.DbConnection;

public class SalesService {

    public void saveNewSales(Sales sales){
        DbConnection con = new DbConnection();
        Connection connection = con.connect();
        
        try{
            String query = " insert into sales (SalesID, ProductName, Price, Quantity)"
            + " values (?, ?, ?, ?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt (1, sales.getId());
            preparedStmt.setString(2, sales.getProductName());
            preparedStmt.setInt(3, sales.getPrice());
            preparedStmt.setInt(4, sales.getQuantity());
            // execute the preparedstatement
            preparedStmt.execute();


        }catch(Exception ex){
           System.out.println("Error: "+ex); 
        }
    }
}
