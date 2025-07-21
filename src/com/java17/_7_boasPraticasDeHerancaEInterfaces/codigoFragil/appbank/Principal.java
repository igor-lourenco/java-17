package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.appbank;

import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.Conta;
import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.ContaCorrente;

public class Principal {

    public static void main(String[] args) {

        Conta conta1 = new ContaComTributacao(new ContaCorrente());
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000.0);
        conta1.sacar(100);
        conta1.transferir(conta2, 100);
//        conta1.aplicarEmInvestimento(100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo());
    }
}
