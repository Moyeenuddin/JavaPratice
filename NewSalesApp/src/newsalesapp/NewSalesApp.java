
package newsalesapp;

import DBConnect.DBConnect;

public class NewSalesApp {

    public static void main(String[] args) {
        DBConnect connect = new DBConnect();
        connect.getData();
    
    }
    
}
