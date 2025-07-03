package com.java17._4_heranca.banco;

public class ContaInvestimento {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    private double valorTotalRendimentos;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double valorSaque){
        if(valorSaque <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        if(getSaldo() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");

        saldo = saldo - valorSaque;
    }

    public void depositar(double valorDeposito){
        if(valorDeposito <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        saldo = saldo + valorDeposito;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualDeJuros){

        double valorRendimentos = getSaldo() * percentualDeJuros / 100;
        this.valorTotalRendimentos = this.valorTotalRendimentos + valorRendimentos;
        depositar(valorRendimentos);
    }

    public void setValorTotalRendimentos(double valorTotalRendimentos) {
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public void imprimirDemonstrativo(){
        System.out.println();
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

}
