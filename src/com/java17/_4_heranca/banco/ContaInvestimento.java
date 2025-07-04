package com.java17._4_heranca.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;


    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void setValorTotalRendimentos(double valorTotalRendimentos) {
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualDeJuros){

        double valorRendimentos = getSaldo() * percentualDeJuros / 100;
        this.valorTotalRendimentos = this.valorTotalRendimentos + valorRendimentos;
        depositar(valorRendimentos);
    }
}
