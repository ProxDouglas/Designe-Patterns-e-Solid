import adapters.PayoneerAdapter;
import payoneer.IPayonnerPayments;
import payoneer.Payoneer;
import paypal.IPayPalPayments;
import paypal.PayPal;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, IPayPalPayments> paymentsMap = new HashMap<>();
        String pagamento = "PayPal";

        paymentsMap.put("Payoneer", new PayoneerAdapter(new Payoneer()));
        paymentsMap.put("PayPal", new PayPal());

        IPayPalPayments payment = paymentsMap.get(pagamento);

        payment.paypalPayment();
        payment.paypalReceive();

    }
}