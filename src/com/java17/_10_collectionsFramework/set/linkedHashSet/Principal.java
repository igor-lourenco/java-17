package com.java17._10_collectionsFramework.set.linkedHashSet;

import com.java17._10_collectionsFramework.set.hashSet.modelo.Contato;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

//      TODO: LinkedHashSet -> garante a ordem de inserção dos elementos
//       mas é um pouco menos performático que o HashSet
        Set<Contato> contatos = new LinkedHashSet<>();

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

        System.out.println();
        System.out.println("Contatos ordenados pela ordem de insercao: ");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
