package com.java17._7_boasPraticasDeHerancaEInterfaces.loja.pagamento;

public class CartaoCredito implements MetodoPagamento {

    private final String numero;

    public CartaoCredito(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void pagar(double valorTotal) {
        if(!numero.startsWith("123")) throw new RuntimeException("Pagamento Negado");

        System.out.printf("Pagamento de R$%.2f realizado. Cartao de credito %s%n", valorTotal, getNumero());
    }
}
