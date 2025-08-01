package com.java17._10_collectionsFramework.set.hashSet;

import com.java17._10_collectionsFramework.set.hashSet.modelo.Contato;

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


        System.out.println();
        System.out.println("Contatos:");
        Contato contato1 = new Contato("Maria", "maria@email.com", 40);
        Contato contato2 = new Contato("Joao", "joao@email.com", 30);
        Contato contato3 = new Contato("Jose", "jose@email.com", 25);
        Contato contato4 = new Contato("Ana", "ana@email.com", 25);

        System.out.println("Contato: " + contato1.hashCode());
        System.out.println("Contato: " + contato2.hashCode());
        System.out.println("Contato: " + contato3.hashCode());
        System.out.println("Contato: " + contato4.hashCode());
    }
}
