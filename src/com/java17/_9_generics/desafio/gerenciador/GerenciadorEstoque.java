package com.java17._9_generics.desafio.gerenciador;

import com.java17._9_generics.desafio.estoque.Estocavel;

public class GerenciadorEstoque<T extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(T estocavel){
        quantidadeTotal = quantidadeTotal + estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal(){
        return quantidadeTotal;
    }
}
