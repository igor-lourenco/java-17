package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.appbank;

import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.Conta;

public class ContaComTributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public ContaComTributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        getContaOriginal().transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        getContaOriginal().aplicarEmInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valor) {
        getContaOriginal().sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
