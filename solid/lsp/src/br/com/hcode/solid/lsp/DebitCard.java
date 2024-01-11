package br.com.hcode.solid.lsp;

public class DebitCard extends NumbankCard{
    @Override
    public void validate() throws Exception {
        super.validate();
        System.out.println("Validando Saldo");
        System.out.println("Saldo Aprovado");
    }
}
