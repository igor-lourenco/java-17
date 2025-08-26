package com.java17._17_expressoesLambdaEMethodReference.implementandoExpressoesLambda;

@FunctionalInterface // anotação informativa
public interface Filtro<T> {

    boolean avaliar(T objeto);

//    void testar();
}
