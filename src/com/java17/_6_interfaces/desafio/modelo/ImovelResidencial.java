package com.java17._6_interfaces.desafio.modelo;

public class ImovelResidencial implements BemSeguravel {

    public static final double JUROS_SOBRE_VALOR_MERCADO = 0.001;
    public static final double ACRESCIMO_POR_AREA_CONSTRUIDA = 0.30;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }


    @Override
    public double calcularValorPremio() {
        double jurosValorMercado = getValorMercado() * JUROS_SOBRE_VALOR_MERCADO;
        double calculoPorAreaConstruida = getAreaConstruida() * ACRESCIMO_POR_AREA_CONSTRUIDA;

        return jurosValorMercado + calculoPorAreaConstruida;
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder()
            .append("Imovel residencial com ")
            .append(getAreaConstruida() + "m2 de area construida, ")
            .append(String.format("avaliado em R$%.2f" ,getValorMercado()));

        return sb.toString();
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }
}
