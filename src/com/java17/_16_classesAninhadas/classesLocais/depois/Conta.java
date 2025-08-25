package com.java17._16_classesAninhadas.classesLocais.depois;

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

        class Pagamento implements Transacao{

//            private BigDecimal taxa;
//            private BigDecimal valor;
//
//            public Pagamento(BigDecimal taxa, BigDecimal valor) {
//                this.taxa = taxa;
//                this.valor = valor;
//            }

            @Override
            public BigDecimal getValorTotal() {
                return valor.add(taxa);
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(taxa).add(valor);
            }
        }


        return new Pagamento();
    }

    public Transacao cobrarTarifa(BigDecimal valor){
        this.saldo = this.saldo.subtract(valor);

        class Tarifa implements Transacao{

//            private BigDecimal valor;
//
//            public Tarifa(BigDecimal valor) {
//                this.valor = valor;
//            }

            @Override
            public BigDecimal getValorTotal() {
                return valor;
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(valor);
            }
        }


        return new Tarifa();
    }
}
