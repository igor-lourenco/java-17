package com.java17._17_expressoesLambdaEMethodReference.interface_Predicate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovendoElementosDaColecao {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

//        Sem usar Expressão Lambda
//        Iterator<Produto> produtoIterator = produtos.iterator();
//        while (produtoIterator.hasNext()){
//            Produto produto = produtoIterator.next();
//            if (produto.getQuantidade() < 1){
//                produtoIterator.remove();
//            }
//        }


        List<Produto> produtoList = new ArrayList<>(produtos);

        Predicate<Produto> removeProdutoSemEstoque = produto -> produto.getQuantidade() < 1;
        Predicate<Produto> removeProdutoInativo = produto -> produto.getStatus().equals(Produto.Status.INATIVO);

        System.out.println("\nRemovendo produtos com estoque menor que 1 e com status igual INATIVO:");
        produtoList.removeIf(removeProdutoSemEstoque.or(removeProdutoInativo));

//        Exemplo: Usando Predicate para negar
//        produtos.removeIf(Predicate.not(removeProdutoSemEstoque.or(removeProdutoInativo)));
//        produtos.removeIf(removeProdutoSemEstoque.or(removeProdutoInativo).negate());


        for (Produto produto : produtoList) {
            System.out.println(produto);
        }

    }
}
