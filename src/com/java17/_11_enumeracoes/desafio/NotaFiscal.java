package com.java17._11_enumeracoes.desafio;

public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;

    private Status status = Status.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void cancelar(){
        if(!this.status.podeCancelarNotaFiscal(getValor())){
            throw new IllegalStateException("Nao foi possivel cancelar a nota fiscal");
        }

        this.status = Status.CANCELADO;
    }

    public void emitir(){
        if(!this.status.podeEmitirNotaFiscal()){
            throw new IllegalStateException("Nao foi possivel emitir a nota fiscal");
        }

        this.status = Status.EMITIDA;
    }

    public String getDescricaoCompleta(){
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f esta: %s",
            getNumero(), getDescricao(), getValor(), this.status.getDescricao());
    }
}
