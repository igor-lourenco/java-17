package com.java17._10_collectionsFramework.list.linkedList;


import com.java17._10_collectionsFramework.list.linkedList.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.linkedList.agencia.Hotel;

import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);

        Hotel hotel = (Hotel) cadastroHotel.obterTodos().get(2);
        System.out.println(hotel);

        LinkedList<Hotel> hoteis = cadastroHotel.obterTodos();
        hoteis.addFirst(new Hotel("Mercure", "Uberlandia/MG", 400)); // adiciona na primeira posicao

        System.out.println("Todos os Hoteis:");
        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(LinkedList<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
