package payment;

import factory.DbProductFactory;
import model.IDbProduct;
import model.MySQLProduct;

public class Payment {
    public void pay(String productID){
        IDbProduct dbProduct = DbProductFactory.create();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
