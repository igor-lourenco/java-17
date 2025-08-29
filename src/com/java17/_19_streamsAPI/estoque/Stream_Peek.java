package com.java17._19_streamsAPI.estoque;

import java.util.List;

public class Stream_Peek {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println("\nExecutando ações intermediárias com stream.peek()");

        produtos.stream()
            .peek(p -> System.out.println("------------------------------------------------------"))
            .peek(p -> System.out.printf("Validando produto: %s, tem no estoque: %d%n", p.getNome(), p.getQuantidade()))
            .filter(Produto::temEstoque)
            .peek(p -> System.out.printf("Validando produto: %s, está inativo: %b%n", p.getNome(), p.isInativo()))
            .filter(Produto::isInativo)
            .forEach(produto -> {
                System.out.println("Inativando produto: " + produto.getNome());
                produto.ativar();
                System.out.println("Ativado: " + produto);
            });

    }
}
