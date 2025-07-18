package com.java17._6_interfaces.financeira.modelo;

public interface ClienteFinanciavel {

    public static final double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    public abstract double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado){
        if(isFinanciamentoPequenoValor(valorSolicitado)){
            return JUROS_BAIXO_RISCO;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }
}
