package com.java17._17_expressoesLambdaEMethodReference.interface_Consumer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterandoEmColecoesComForEach {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

//        Sem usar Expressão Lambda
//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }

        Consumer<Produto> zerandoEstoque = produto -> produto.setQuantidade(0);
        Consumer<Produto> imprimir = produto -> System.out.println(produto);

        System.out.println("\nZerando a quantidade de estoque e depois imprimir:");
        produtos.forEach(zerandoEstoque.andThen(imprimir));


        System.out.println("---------------------------");
        System.out.println("Referenciando métodos de uma instância particular");
        List<Produto> produtos1 = new ArrayList<>(produtos);

        var servicoInativar = new ServicoInativacaoProduto();
        produtos1.forEach(servicoInativar::inativar);

        produtos1.forEach(System.out::println);
    }
}
