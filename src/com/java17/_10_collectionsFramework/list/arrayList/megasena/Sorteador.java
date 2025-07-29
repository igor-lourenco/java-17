package com.java17._10_collectionsFramework.list.arrayList.megasena;

import java.util.Iterator;

public class Sorteador implements Iterable<Integer> {


    @Override
    public Iterator<Integer> iterator() {
        System.out.println("DEBUG: Retornando um Iterator");
        return new SorteadorIterator();
    }
}
