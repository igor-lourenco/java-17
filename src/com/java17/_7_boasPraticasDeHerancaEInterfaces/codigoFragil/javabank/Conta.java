package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank;

public interface Conta {

    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta conta, double valor);

    void aplicarEmInvestimento(double valor);
}
