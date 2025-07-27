package com.java17._9_generics.estruturaDeDados.estrutura;

import java.util.Arrays;

//public class Pilha<E extends Produto> { // Usando delimitador
public class Fila<A> implements Colecao<A> {

    private A[] itens;

    public Fila() {
        this.itens = (A[]) new Object [0];
    }

    public void colocar(A item){
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        this.itens[this.itens.length - 1] = item;
    }

    public A retirar(){
        if(this.itens.length == 0){
            throw new IllegalArgumentException("Pilha sem itens");
        }

        A item = this.itens[0];
        this.itens = Arrays.copyOfRange(this.itens, 1 ,this.itens.length);
        return item;
    }
}
