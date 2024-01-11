package factory;

import model.Db;
import model.IDbProduct;
import model.MongoDBProduct;
import model.MySQLProduct;

public class DbProductFactory {
    public static IDbProduct create(Db type){
        if(type == Db.MYSQL)
            return new MySQLProduct();
        else
            return new MongoDBProduct();
    }
}
