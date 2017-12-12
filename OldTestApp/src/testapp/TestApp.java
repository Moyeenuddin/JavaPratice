
package testapp;

import entity.Sales;
import service.SalesService;

public class TestApp {

    
    public static void main(String[] args) {
        Sales sales = new Sales();
        
        sales.setId(4);
        sales.setProductName("Book");
        sales.setPrice(80);
        sales.setQuantity(5);
        
        SalesService salesService = new SalesService();
        salesService.saveNewSales(sales);
        

    }    
    
}
