package com.java17._11_enumeracoes.desafio;

public enum Status {

    NAO_EMITIDA("Nao Emitida"),

    EMITIDA("Emitida") {
        @Override
        public boolean podeEmitirNotaFiscal() { // Exemplo de sobrescrita de método em Enum
            return !(this.equals(EMITIDA) || this.equals(CANCELADO));
        }
    },

    CANCELADO("Cancelado"){
        @Override
        public boolean podeCancelarNotaFiscal(double valor) { // Exemplo de sobrescrita de método em Enum
            return !((this.equals(EMITIDA) && valor >= 1_000)
                || this.equals(CANCELADO));
        }
    };

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean podeEmitirNotaFiscal(){
        return !(this.equals(EMITIDA) || this.equals(CANCELADO));
    }

    public boolean podeCancelarNotaFiscal(double valor){
        return !((this.equals(EMITIDA) && valor >= 1_000)
            || this.equals(CANCELADO));
    }
}
