package com.java17._6_interfaces.financeira.modelo;

public interface Bonificacao extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancavel);
}
