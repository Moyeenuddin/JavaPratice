
package testapp;

import entity.Product;
import entity.Sales;
import service.ProductService;
import service.SalesService;

public class TestApp {

    
    public static void main(String[] args) {
        Sales sales = new Sales();
        
        sales.setId(6);
        sales.setProductName("Book");
        sales.setPrice(80);
        sales.setQuantity(5);
        
        SalesService salesService = new SalesService();
        salesService.saveNewSales(sales);
        
    
    
        Product product = new Product();
        
        product.setId(1);
        product.setName("Book");
        product.setPrice(80);
        
        ProductService productService = new ProductService();
        productService.saveNewProduct(product);
        
    }    
    
}

