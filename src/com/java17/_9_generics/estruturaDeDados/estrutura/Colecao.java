package com.java17._9_generics.estruturaDeDados.estrutura;

public interface Colecao<T> {

    void colocar(T item);

    T retirar();
}
