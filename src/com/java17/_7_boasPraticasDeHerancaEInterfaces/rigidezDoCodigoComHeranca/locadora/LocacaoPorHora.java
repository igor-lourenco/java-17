package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class LocacaoPorHora extends Locacao{


    public LocacaoPorHora(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        return getNotebook().getPrecoPorHora() * horasUtilizadas;
    }
}
