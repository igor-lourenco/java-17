package com.java17._10_collectionsFramework.set.hashSet;

import com.java17._10_collectionsFramework.set.hashSet.modelo.Contato;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

//        imprimirNumerosComHashSet();

        Set<Contato> contatos = new HashSet<>();

        Contato contato1 = new Contato("Maria", "maria@email.com", 40);
        Contato contato2 = new Contato("Joao", "joao@email.com", 30);
        Contato contato3 = new Contato("Jose", "jose@email.com", 25);
        Contato contato4 = new Contato("Ana", "ana@email.com", 25);
        Contato contato5 = new Contato("Rosa", "rosa@email.com", 25);

        Contato contato6 = new Contato("Rose", "rose@email.com", 25);

        System.out.println("------------");
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);

        System.out.println("------------");
        System.out.println("Contem: " + contatos.contains(contato6));



        }

    private static void imprimirNumerosComHashSet() {
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
