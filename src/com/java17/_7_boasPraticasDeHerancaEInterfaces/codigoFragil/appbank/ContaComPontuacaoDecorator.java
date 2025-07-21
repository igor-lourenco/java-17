package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.appbank;

import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.Conta;

public class ContaComPontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public ContaComPontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }

    public int getPontos() {
        return pontos;
    }
}
