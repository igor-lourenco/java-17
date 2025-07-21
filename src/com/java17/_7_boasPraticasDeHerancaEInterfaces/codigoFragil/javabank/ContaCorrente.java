package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank;

public class ContaCorrente implements Conta{

    private double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta conta, double valor) {
//        this.saldo -= valor;
        sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        this.saldo -= valor;
        // aqui aplicaria o dinheiro do investimento
    }

}
