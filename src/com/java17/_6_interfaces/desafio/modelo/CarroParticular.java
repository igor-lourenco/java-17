package com.java17._6_interfaces.desafio.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public static final double JUROS_VALOR_DE_MERCADO = 0.04;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * JUROS_VALOR_DE_MERCADO;

        if(getAnoFabricacao() < 2000){
            valorPremio *= 0.05;
        }

        return valorPremio;
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder()
             .append("Carro particular " + getModelo())
            .append(" ano " + getAnoFabricacao())
            .append(String.format(", avaliado em R$%.2f", getValorMercado()));

        return sb.toString();
    }
}
