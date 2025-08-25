package com.java17._16_classesAninhadas.classesLocais.antes;

import java.math.BigDecimal;

public class Tarifa implements Transacao {

    private BigDecimal valor;

    public Tarifa(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valor;
    }
}
