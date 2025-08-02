package com.java17._10_collectionsFramework.set.desafio;

import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

//        Performance é mais importante (não garante o ordem dos elementos)
//        Set<Cidade> cidades = new HashSet<>();

//        Performance é importante , mas precisa manter o ordem de inserção dos elementos
//        Set<Cidade> cidades = new LinkedHashSet<>();

//        Performance é menos importante e precisa manter o ordem natural dos elementos
        Set<Cidade> cidades = new TreeSet<>();

        cidades.add(new Cidade(3170206, "Uberlandia", 700_000));
        cidades.add(new Cidade(3170107, "Uberaba", 340_000));
        cidades.add(new Cidade(3550308, "Sao Paulo", 12_000));
        cidades.add(new Cidade(3106200, "Belo Horizonte", 590_000));
        cidades.add(new Cidade(2304400, "Fortaleza", 2_700_000));
        cidades.add(new Cidade(1100205, "Porto Velho", 548_000));

        System.out.println("\nCidades:");
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
