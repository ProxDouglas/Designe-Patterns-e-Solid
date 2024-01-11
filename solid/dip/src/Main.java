import factory.DbProductFactory;
import model.Db;
import model.IDbProduct;
import payment.Payment;

public class Main {
    public static void main(String[] args) {
        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        Payment payment = new Payment();
        payment.pay("250");
    }
}