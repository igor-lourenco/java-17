package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class LocacaoPorHoraSeguroSantander extends LocacaoPorHora{


    public LocacaoPorHoraSeguroSantander(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);
        valorTotal = valorTotal + (horasUtilizadas * 0.5) + (valorTotal * 0.05);
        return valorTotal;
    }
}
