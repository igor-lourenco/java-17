package com.java17._7_boasPraticasDeHerancaEInterfaces.rigidezDoCodigoComHeranca.locadora;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorValorTotal = getPrecificacao().calcularValorTotal(getNotebook(), horasUtilizadas);

        if(temSeguro()){
            valorValorTotal = valorValorTotal + getSeguro().calcularPremio(horasUtilizadas, valorValorTotal);
        }
        return valorValorTotal;
    }

    private boolean temSeguro() {
        return seguro != null;
    }
}
