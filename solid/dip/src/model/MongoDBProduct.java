package model;

public class MongoDBProduct implements IDbProduct{
    public String getProductById(String productID){
        return "MongoDB: exibindo dados do produto " + productID;
    }
}
