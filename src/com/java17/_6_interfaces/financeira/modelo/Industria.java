package com.java17._6_interfaces.financeira.modelo;

public class Industria extends EmpresaFinanciavel  {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL = 1.2;

    private boolean compensaEmissaoCO2;

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCO2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoCO2 = compensaEmissaoCO2;
    }

    @Override
    public double calcularLimiteAprovado() {
        double valorAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if(isCompensaEmissaoCO2()){
            valorAprovado = valorAprovado * TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL;
        }

        return valorAprovado;
    }

    public boolean isCompensaEmissaoCO2() {
        return compensaEmissaoCO2;
    }

    public void setCompensaEmissaoCO2(boolean compensaEmissaoCO2) {
        this.compensaEmissaoCO2 = compensaEmissaoCO2;
    }
}
