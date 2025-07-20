package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class PrecificacaoPorDia implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return notebook.getPrecoPorDia() * dias;
    }
}
