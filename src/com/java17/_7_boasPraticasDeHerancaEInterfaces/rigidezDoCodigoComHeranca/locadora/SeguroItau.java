package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class SeguroItau implements Seguro{

    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return dias * 5;
    }
}
