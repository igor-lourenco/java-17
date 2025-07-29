package com.java17._10_collectionsFramework.list.arrayList.megasena;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private final static Random RANDOM = new Random();
    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        System.out.println("DEBUG: Tem proximo elemento: " + (quantidadeSorteada < 6));
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {

        if(!hasNext()) throw new NoSuchElementException("Todos os numeros ja foram sorteados");

        quantidadeSorteada++;

        System.out.println("DEBUG: Sorteando numero");
        return RANDOM.nextInt(60);
    }
}
