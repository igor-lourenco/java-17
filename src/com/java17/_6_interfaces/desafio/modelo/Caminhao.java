package com.java17._6_interfaces.desafio.modelo;

public class Caminhao extends VeiculoAutomotor{

    public static final double JUROS_VALOR_DE_MERCADO = 0.02;
    public static final double ACRESCIMO_VALOR_POR_EIXO = 50.0;

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * JUROS_VALOR_DE_MERCADO;
        double valorPorEixo = getQuantidadeEixos() * ACRESCIMO_VALOR_POR_EIXO;

        return valorPremio + valorPorEixo;
    }

    @Override
    public String descrever() {
        StringBuilder sb = new StringBuilder()
            .append("Caminhao " + getModelo())
            .append(" ano " + getAnoFabricacao())
            .append(", " + getQuantidadeEixos() + " eixos")
            .append(String.format(", avaliado em R$%.2f", getValorMercado()));

        return sb.toString();
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
}
