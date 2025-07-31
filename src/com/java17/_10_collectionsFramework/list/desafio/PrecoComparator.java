package com.java17._10_collectionsFramework.list.desafio;

import java.util.Comparator;

public class PrecoComparator<T extends Pacote> implements Comparator<T> {

    @Override
    public int compare(T obj1, T obj2) {
        return Double.compare(obj1.getPrecoPorPessoa(), obj2.getPrecoPorPessoa());
    }
}
