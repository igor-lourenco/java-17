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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("[");
        sb.append("titular=").append(getTitular());
        sb.append(", agencia=").append(getAgencia());
        sb.append(", numero=").append(getNumero());
        sb.append(", saldo=").append(getSaldo());
        sb.append(", valorTotalRendimentos=").append(valorTotalRendimentos);
        sb.append(']');
        return sb.toString();
    }

}
