package com.java17._6_interfaces.financeira.modelo;

public interface ClienteFinanciavel {

    public abstract double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado){
        if(isFinanciamentoPequenoValor(valorSolicitado)){
            return 1.0;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }
        return 2.0;
    }

    private boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

    private boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }
}
