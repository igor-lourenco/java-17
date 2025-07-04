package com.java17._4_heranca.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }


    public void creditarRendimentos(double percentualDeJuros){

        double valorRendimentos = getSaldo() * percentualDeJuros / 100;
        this.valorTotalRendimentos = this.valorTotalRendimentos + valorRendimentos;
        depositar(valorRendimentos);
    }
}
