package com.java17._10_collectionsFramework.set.treeSet.modelo;

import java.util.Comparator;

public class IdadeContatoComparator implements Comparator<Contato> {
    @Override
    public int compare(Contato o1, Contato o2) {
        System.out.printf("compare %s = %s%n", o1.getIdade(), o2.getIdade());
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
