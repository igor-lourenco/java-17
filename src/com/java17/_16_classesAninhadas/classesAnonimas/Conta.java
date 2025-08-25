package com.java17._16_classesAninhadas.classesAnonimas;

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

        Transacao transacao = new Transacao() {

            @Override
            public BigDecimal getValorTotal() {
                return valor.add(taxa);
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(taxa).add(valor);
            }
        };

        return transacao;
    }

    public Transacao cobrarTarifa(BigDecimal valor){
        this.saldo = this.saldo.subtract(valor);

        Transacao transacao = new Transacao() {

            @Override
            public BigDecimal getValorTotal() {
                return valor;
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(valor);
            }
        };


        return transacao;
    }
}
