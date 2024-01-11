package br.com.hcode.solid.lsp;

abstract public class NumbankCard implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {

    }

    @Override
    public void collectPayment() {
        System.out.print("Pagamento realizado");
    }
}
