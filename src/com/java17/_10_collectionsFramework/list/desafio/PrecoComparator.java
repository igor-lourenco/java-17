package com.java17._10_collectionsFramework.list.desafio;

import java.util.Comparator;

public class PrecoComparator implements Comparator<PacoteViagem> {
    @Override
    public int compare(PacoteViagem obj1, PacoteViagem obj2) {
        return Double.compare(obj1.getPrecoPorPessoa(), obj2.getPrecoPorPessoa());
    }
}
