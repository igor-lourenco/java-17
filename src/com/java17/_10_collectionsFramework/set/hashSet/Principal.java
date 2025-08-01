package com.java17._10_collectionsFramework.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        System.out.println("Adicionado: " + numeros.add(10));
        System.out.println("Adicionado: " + numeros.add(20));
        System.out.println("Adicionado: " + numeros.add(30));
        System.out.println("Adicionado: " + numeros.add(40));
        System.out.println("Adicionado: " + numeros.add(50));
        System.out.println("Adicionado: " + numeros.add(60));
        System.out.println("Adicionado: " + numeros.add(60));
        System.out.println("Adicionado: " + numeros.add(null));

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()){
            System.out.println("Numeros: " + iterator.next());
        }
    }
}
