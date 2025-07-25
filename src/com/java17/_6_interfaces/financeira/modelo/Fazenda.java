package com.java17._6_interfaces.financeira.modelo;

public class Fazenda extends EmpresaFinanciavel  {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE = 1.2;
    public static final double TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE = 5;


    private double tamanhoEmHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEmHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    @Override
    public double calcularLimiteAprovado() {
        double limiteAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if(getTamanhoEmHectares() >= TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE){
            limiteAprovado = limiteAprovado * TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE;
        }

        return limiteAprovado;
    }

    public double getTamanhoEmHectares() {
        return tamanhoEmHectares;
    }

    public void setTamanhoEmHectares(double tamanhoEmHectares) {
        this.tamanhoEmHectares = tamanhoEmHectares;
    }
}
