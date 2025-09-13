package com.java17._22_serializacaoDeObjetos.desafio.modelo;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 3080897799303215474L;

    private String nome;
    private final Endereco endereco;
    private BigDecimal limiteCredito;

    public Cliente(String nome, Endereco endereco, BigDecimal limiteCredito) {
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", endereco=").append(endereco);
        sb.append(", limiteCredito=").append(limiteCredito);
        sb.append('}');
        return sb.toString();
    }
}
