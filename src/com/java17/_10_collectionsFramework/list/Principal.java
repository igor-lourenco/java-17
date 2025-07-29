package com.java17._10_collectionsFramework.list;

import com.java17._10_collectionsFramework.list.vector.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.vector.agencia.Hotel;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);


        convertendoListaParaArray(cadastroHotel);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(25);
        numeros.add(57);
        numeros.add(40);
        numeros.add(83);

        System.out.println();
        ordemNatural(numeros);

        System.out.println();
        ordemNaturalHoteis(cadastroHotel);
    }

    private static void ordemNaturalHoteis(CadastroHotel cadastroHotel) {
        Hotel[] hoteis = cadastroHotel.obterTodosComArray();
        Collections.sort(numeros, Comparator.reverseOrder());
        System.out.println(numeros);
    }

    private static void ordemNatural( List<Integer> numeros) {
        Collections.sort(numeros, Comparator.reverseOrder());
        System.out.println(numeros);
    }

    private static void convertendoListaParaArray(CadastroHotel cadastroHotel) {
        Hotel[] hoteis = cadastroHotel.obterTodosComArray();
        System.out.println(Arrays.toString(hoteis));
    }
}
