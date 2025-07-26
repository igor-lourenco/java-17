package com.java17._9_generics.estruturaDeDados.estrutura;

import java.util.Arrays;

//public class Pilha<E extends Produto> { // Usando delimitador
public class Pilha<E> {

    private E[] itens;

    public Pilha() {
        this.itens = (E[]) new Object [0];
    }

    public void colocar(E item){
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        this.itens[this.itens.length - 1] = item;
    }

    public E retirar(){
        if(this.itens.length == 0){
            throw new IllegalArgumentException("Pilha sem itens");
        }

        E item = this.itens[this.itens.length - 1];
        this.itens = Arrays.copyOf(this.itens, this.itens.length - 1);
        return item;
    }
}
