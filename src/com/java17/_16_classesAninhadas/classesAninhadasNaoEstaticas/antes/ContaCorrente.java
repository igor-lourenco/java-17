package com.java17._16_classesAninhadas.classesAninhadasNaoEstaticas.antes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
