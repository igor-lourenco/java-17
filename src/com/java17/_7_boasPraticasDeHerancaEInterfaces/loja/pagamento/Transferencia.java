package com.java17._7_boasPraticasDeHerancaEInterfaces.loja.pagamento;

public class Transferencia implements MetodoPagamento{

    private final String agencia;
    private final String numeroConta;

    public Transferencia(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void pagar(double valorTotal) {
        if(!numeroConta.startsWith("999")) throw new RuntimeException("Pagamento Negado");

        System.out.printf("Pagamento de R$%.2f realizado. Agencia %s, conta %s%n", valorTotal, getAgencia(), getNumeroConta());

    }
}
