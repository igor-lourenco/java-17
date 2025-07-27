package com.java17._9_generics.desafio;

import com.java17._9_generics.desafio.estoque.Carro;
import com.java17._9_generics.desafio.estoque.Roupa;
import com.java17._9_generics.desafio.gerenciador.GerenciadorEstoque;

public class Principal {

    public static void main(String[] args) {

        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque();
//        estoqueRoupas.adicionar(new Carro("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta preta", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta branca", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta Rosa", 4));

        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque();
        estoqueCarros.adicionar(new Carro("BMW X1", 4));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 5));
        estoqueCarros.adicionar(new Carro("Corolla ", 6));

        imprimirEstoque(estoqueCarros);
    }

    private static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque) {

        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }
}
