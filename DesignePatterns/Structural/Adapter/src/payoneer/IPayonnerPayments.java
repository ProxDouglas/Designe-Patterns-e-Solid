package payoneer;

import utils.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void ReceivePayment();
}
