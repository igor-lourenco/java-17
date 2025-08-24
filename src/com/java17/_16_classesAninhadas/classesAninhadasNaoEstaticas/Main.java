package com.java17._16_classesAninhadas.classesAninhadasNaoEstaticas;

import com.java17._16_classesAninhadas.classesAninhadasNaoEstaticas.depois.ContaCorrente;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(new BigDecimal("1000"));

        System.out.println("Saldo antes: " + contaCorrente.getSaldo());

        ContaCorrente.Transacao transacao1 = contaCorrente.new Transacao(
            "Compra mercado", new BigDecimal("180.9"));

        ContaCorrente.Transacao transacao2 = contaCorrente.new Transacao(
            "Academia", new BigDecimal("170"));


        System.out.println("Saldo depois: " + contaCorrente.getSaldo());

        for (ContaCorrente.Transacao transacao : contaCorrente.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }
    }
}
