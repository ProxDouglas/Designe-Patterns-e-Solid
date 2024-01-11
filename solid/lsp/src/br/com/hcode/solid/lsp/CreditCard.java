package br.com.hcode.solid.lsp;

public class CreditCard extends NumbankCard{
    @Override
    public void validate() throws Exception {
        super.validate();
        System.out.println("Validando Limite");
        System.out.println("Limite OK");
    }
}
