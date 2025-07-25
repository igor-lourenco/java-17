package com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades;

public class NotaFiscalProduto extends NotaFiscal{

    public static final double ALIQUOTA_IMPOSTOS_FEDERAIS = 0.18;
    public static final double ALIQUOTA_IMPOSTOS_ESTADUAIS = 0.12;

    private double valorFrete;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS_FEDERAIS;
        valorImpostos = valorImpostos + getValorTotal() * ALIQUOTA_IMPOSTOS_ESTADUAIS;

        return valorImpostos;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
