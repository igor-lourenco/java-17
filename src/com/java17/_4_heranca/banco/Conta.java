package com.java17._4_heranca.banco;

public class Conta {

    public final static int NORMAL = 0;
    public final static int INVESTIMENTO = 1;
    public final static int ESPECIAL = 2;


    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    private int tipo = 0;

    // conta investimento
    private double valorTotalRendimentos;

    // conta especial
    private double tarifaMensal;
    private double limiteChequeEspecial;

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

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void sacar(double valorSaque){
        if(valorSaque <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        if(getSaldoDisponivel() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");

        saldo = saldo - valorSaque;
    }

    public void depositar(double valorDeposito){
        if(valorDeposito <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        saldo = saldo + valorDeposito;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if(tipo != NORMAL && tipo != INVESTIMENTO && tipo != ESPECIAL){
            throw new IllegalArgumentException("Tipo invalido: " + tipo);
        }
        this.tipo = tipo;

        if (this.tipo != ESPECIAL) this.limiteChequeEspecial = 0;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualDeJuros){
        if(getTipo() == NORMAL) throw new RuntimeException("Nao pode creditar rendimentos neste tipo de conta");

        double valorRendimentos = getSaldo() * percentualDeJuros / 100;
        this.valorTotalRendimentos = this.valorTotalRendimentos + valorRendimentos;
        depositar(valorRendimentos);
    }

    public void setValorTotalRendimentos(double valorTotalRendimentos) {
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if(getTipo() != ESPECIAL) throw new RuntimeException("Esse tipo de conta nao permite limite de cheque especial");


        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void imprimirDemonstrativo(){
        System.out.println();
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }

    public void debitarTarifaMensal(){
        if(getTipo() != ESPECIAL) throw new RuntimeException("Nao pode debitar tarifa mensal neste tipo de conta");

        sacar(getTarifaMensal());
    }

}
