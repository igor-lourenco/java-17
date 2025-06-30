package com.java17._2_construtoresPacotesEVisibilidade.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 10;

    String nome;
    int quantidadeEstoque;

    final String codigo; // Após inicializa no construtor, não pode ser modificada.

    Produto() {
        // chama o outro construtor da classe,
        // Obs: só pode usar o this para chamar o construtor da classe apenas dentro do próprio construtor da classe
        // e tem que ser a primeira instrução.
        this("Sem nome");
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }


    Produto(String nome, int estoqueInicial){
        Objects.requireNonNull(nome, "Nome nao pode ser nulo");

        if(estoqueInicial < 0) throw new IllegalArgumentException("Quantidade de estoque nao pode ser menor que zero");

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();
    }

}
