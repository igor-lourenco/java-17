package com.java17._22_serializacaoDeObjetos.desafio.modelo;

import java.io.Serial;
import java.io.Serializable;

public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 5439414191454361893L;

    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Endereco{");
        sb.append("rua='").append(rua).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", bairro='").append(bairro).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
