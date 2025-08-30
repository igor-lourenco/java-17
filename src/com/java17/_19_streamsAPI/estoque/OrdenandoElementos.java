package com.java17._19_streamsAPI.estoque;

import java.util.Comparator;
import java.util.List;

public class OrdenandoElementos {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .peek(p -> System.out.println("---------------------------------------"))
            .peek(p -> System.out.printf("Produto: %s, tem estoque? %s%n", p.getNome(), p.temEstoque()))
            .filter(Produto::temEstoque)
//            .sorted(Comparator.comparingInt(p -> p.getQuantidade())) // ordenando pela quantidade
            .sorted(Comparator.comparing(p -> p.getNome())) // ordenando pelo nome
            .forEach(p -> System.out.printf("%s = %d unidades%n", p.getNome(), p.getQuantidade()));

    }
}
