package com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.appbank;

import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.Conta;
import com.java17._7_boasPraticasDeHerancaEInterfaces.codigoFragil.javabank.ContaCorrente;

public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        sacarTarifa(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        super.transferir(conta, valor);
        sacarTarifa(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        super.aplicarEmInvestimento(valor);
        sacarTarifa(valor);
    }

    public void sacarTarifa(double valorMovimentacao){
        super.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
