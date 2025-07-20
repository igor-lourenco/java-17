package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class LocacaoPorHoraSeguroItau extends LocacaoPorHora{


    public static final int CUSTO_FIXO_POR_DIA = 5;

    public LocacaoPorHoraSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);
        double dias = Math.ceil(horasUtilizadas / 24d);
        valorTotal = valorTotal + dias * CUSTO_FIXO_POR_DIA;
        return valorTotal;
    }
}
