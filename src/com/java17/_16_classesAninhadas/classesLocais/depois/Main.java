package com.java17._16_classesAninhadas.classesLocais.depois;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(new BigDecimal("1000"));
        System.out.printf("\nSaldo inicial: R$%s%n", conta.getSaldo());

        Transacao transacao1 = conta.efetuarPagamento(new BigDecimal("100"));
        Transacao transacao2 = conta.cobrarTarifa(new BigDecimal("20"));

        System.out.printf("Transação 1: R$%s%n", transacao1.getValorTotal());
        System.out.printf("Transação 2: R$%s%n", transacao2.getValorTotal());
        System.out.printf("Saldo final: R$%s%n", conta.getSaldo());

        transacao1.reembolsar();
        System.out.printf("Reembolso da transação 1, saldo final: R$%s%n", conta.getSaldo());

        transacao2.reembolsar();
        System.out.printf("Reembolso da transação 2, saldo final: R$%s%n", conta.getSaldo());


    }
}
