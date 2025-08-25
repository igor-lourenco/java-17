package com.java17._16_classesAninhadas.classesLocais.antes;

import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Transacao efetuarPagamento(BigDecimal valor){
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        this.saldo = this.saldo.subtract(taxa).subtract(valor);

        return new Pagamento(taxa, valor);
    }

    public Transacao cobrarTarifa(BigDecimal valor){
        this.saldo = this.saldo.subtract(valor);

        return new Tarifa(valor);
    }
}
