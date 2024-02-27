package adapters;

import payoneer.Payoneer;
import paypal.IPayPalPayments;
import utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando Payoneer utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return this.payoneer.authToken();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.ReceivePayment();
    }
}
