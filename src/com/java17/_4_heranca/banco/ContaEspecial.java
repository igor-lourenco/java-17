package com.java17._4_heranca.banco;

public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteChequeEspecial;


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
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal(){
        sacar(getTarifaMensal());
    }


    public double getSaldoDisponivel(){
        return getSaldo() + this.limiteChequeEspecial;
    }

    @Override
    public void sacar(double valorSaque) {
        if(valorSaque <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        if(getSaldoDisponivel() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");

        setSaldo(getSaldo() - valorSaque);
    }


    @Override
    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
        System.out.printf("Saldo disponivel: %.2f", getSaldoDisponivel());
        System.out.println();
    }
}
