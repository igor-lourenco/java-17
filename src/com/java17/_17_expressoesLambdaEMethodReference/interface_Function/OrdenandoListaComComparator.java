package com.java17._17_expressoesLambdaEMethodReference.interface_Function;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class OrdenandoListaComComparator {

    public static void main(String[] args) {

        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));


        System.out.println("\nComparando pela quantidade do produto e pelo nome caso tenha quantidades iguais:");
        List<Produto> produtos1 = new ArrayList<>(produtos);
        Function<Produto,Integer> function1 = produto -> produto.getQuantidade();
        Function<Produto,String> function2 = produto -> produto.getNome();
        produtos1.sort(Comparator.comparing(function1).thenComparing(function2));

        produtos1.forEach(produto -> System.out.println(produto));

        System.out.println("-------------------------------");
        List<Produto> produtos2 = new ArrayList<>(produtos);

        System.out.println("\nUsando o ToIntFunction para comparar com int primitivo:");
        ToIntFunction<Produto> intFunction = p -> p.getQuantidade();
        produtos2.sort(Comparator.comparingInt(intFunction));

        produtos2.forEach(produto -> System.out.println(produto));

    }
}
