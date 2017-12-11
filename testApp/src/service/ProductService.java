
package service;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import testapp.connection.DbConnection;

public class ProductService {
    
    public void saveNewProduct(Product product){
        DbConnection con = new DbConnection();
        Connection connection = con.connect();
        
        try{
            String query = " insert into product (id, Name, Price)"
            + " values (?, ?, ?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt (1, product.getId());
            preparedStmt.setString(2, product.getName());
            preparedStmt.setInt(3, product.getPrice());
            // execute the preparedstatement
            preparedStmt.execute();


        }catch(Exception ex){
           System.out.println("Error: "+ex); 
        }
    }    
    
}
