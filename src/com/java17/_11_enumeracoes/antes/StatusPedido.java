package com.java17._11_enumeracoes.antes;

public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    DESPACHADO(6),
    SEPARADO(8),
    ENTREGUE(0),
    CANCELADO;

    private Integer tempoEntregaEmHoras;

    StatusPedido(){ }

    StatusPedido(int tempoEntregaEmHoras){
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public Integer getTempoEntregaEmHoras() {
        return tempoEntregaEmHoras;
    }
}
