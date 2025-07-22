package com.java17._8_excecoes.estoque;

import com.java17._8_excecoes.estoque.modelo.Produto;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);

        produto.ativar();

        produto.retirarEstoque(15);

        System.out.printf("%nEstoque: %d%n", produto.getQuantidadeEstoque());
    }
}
