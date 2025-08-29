package com.java17._19_streamsAPI.estoque;

import java.util.List;

public class Stream_anyMatch_allMatch_noneMatch {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println("\nUsando o anyMatch para verificar se existe algum produto no estoque");
        boolean temProdutoComEstoque = produtos.stream()
            .peek(p -> System.out.printf("Produto: %s, tem no estoque: %b, quantidade: %d%n", p.getNome(), p.temEstoque(), p.getQuantidade()))
            .anyMatch(Produto::temEstoque);

        System.out.println("Tem produto no estoque: " + temProdutoComEstoque);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nUsando o allMatch para verificar se todos os produto tem no estoque");
        boolean todosProdutoPossuemEmEstoque = produtos.stream()
            .peek(p -> System.out.printf("Produto: %s, tem no estoque: %b, quantidade: %d%n", p.getNome(), p.temEstoque(), p.getQuantidade()))
            .allMatch(Produto::temEstoque);

        System.out.println("Todos os produtos tem estoque: " + todosProdutoPossuemEmEstoque);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nUsando o noneMatch para verificar se nenhum produto tem no estoque");
        boolean nenhumProdutoTemEstoque = produtos.stream()
            .peek(p -> System.out.printf("Produto: %s, tem no estoque: %b, quantidade: %d%n", p.getNome(), p.temEstoque(), p.getQuantidade()))
            .noneMatch(Produto::temEstoque);

        System.out.println("Todos os produtos estão sem estoque: " + nenhumProdutoTemEstoque);

    }
}
