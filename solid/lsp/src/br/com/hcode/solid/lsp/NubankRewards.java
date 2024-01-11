package br.com.hcode.solid.lsp;

public class NubankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        System.out.println("Limite OK, Rewards OK");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
        System.out.println("Pontuação creditada no pragrama rewards");
    }
}
