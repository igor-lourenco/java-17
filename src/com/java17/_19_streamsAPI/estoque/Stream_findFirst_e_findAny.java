package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.Optional;

public class Stream_findFirst_e_findAny {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println("\nUsando o findFirst para retornar o primeiro elemento que satisfaça os critérios");

        Optional<Produto> produtoOptional1 = produtos.stream()
            .peek(p -> System.out.printf("Produto: %s, tem estoque: %d, está inativo: %b%n", p.getNome(), p.getQuantidade(), p.isInativo()))
            .filter(p -> p.temEstoque() && p.isInativo())
            .findFirst();

        Produto produto1 = produtoOptional1
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        System.out.println("\nProduto encontrado: " + produto1);

        System.out.println("-----------------------------------------");
        System.out.println("\nUsando o findAny para retornar qualquer elemento que satisfaça os critérios ");

        Optional<Produto> produtoOptional2 = produtos.stream()
            .peek(p -> System.out.printf("Produto: %s, tem estoque: %d, está inativo: %b%n", p.getNome(), p.getQuantidade(), p.isInativo()))
            .filter(p -> p.temEstoque() && p.isInativo())
            .findAny();

        Produto produto2 = produtoOptional2
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        System.out.println("\nProduto encontrado: " + produto2);

    }
}
