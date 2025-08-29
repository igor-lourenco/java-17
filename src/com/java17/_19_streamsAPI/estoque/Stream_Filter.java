package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.stream.Stream;

public class Stream_Filter {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos = cadastroProduto.obterTodos();
        Stream<Produto> stream = produtos.stream();

        System.out.println("Predicate -> Operação intermediária(operação tardia - lazy)");

        Stream<Produto> produtosEmEstoque = stream.filter(Produto::temEstoque);

        Stream<Produto> produtosInativos = produtosEmEstoque.filter(Produto::isInativo);

        System.out.println();
        System.out.println("Usando forEach -> Operação terminal");
        produtosInativos.forEach(produto -> {
            System.out.println("produto= " + produto);
            produto.ativar();
            System.out.println("produto= " + produto + "\n");
        });


        System.out.println("-----------------------------------------------");
        System.out.println("Criando pipeline com encadeamento de operações");
        System.out.println("------------------------------------------------");

        List<Produto> produtos2 = produtos;

        System.out.println();

        produtos2.stream()
            .filter(Produto::temEstoque)
            .filter(Produto::isAtivo)
            .forEach(produto -> {
                System.out.println("Inativando produto: " + produto);
                produto.inativar();
                System.out.println(produto + "\n");
            });

    }
}
