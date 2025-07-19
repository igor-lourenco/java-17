package com.java17._6_interfaces.desafio.modelo;

public abstract class VeiculoAutomotor implements BemSeguravel {

    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
