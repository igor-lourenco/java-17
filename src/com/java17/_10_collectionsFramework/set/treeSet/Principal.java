package com.java17._10_collectionsFramework.set.treeSet;

import com.java17._10_collectionsFramework.set.treeSet.modelo.Contato;

import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

        Set<Contato> contatos = new TreeSet<>();
//        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

        Contato contato1 = new Contato("Maria", "maria@email.com", 40);
        Contato contato2 = new Contato("Joao", "joao@email.com", 30);
        Contato contato3 = new Contato("Jose", "jose@email.com", 25);
        Contato contato4 = new Contato("Ana", "ana@email.com", 25);
        Contato contato5 = new Contato("Rosa", "rosa@email.com", 25);

        Contato contato6 = new Contato("Rose", "rose@email.com", 25);

        System.out.println("------------");
        System.out.println("Adicionando no Set e ja ordenando...");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);

//        contatos.add(null); // TreeSet não aceita null

        System.out.println("------------");
        System.out.println("Contatos ja ordenados: ");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }

    }
}
