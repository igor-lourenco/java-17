package com.java17._10_collectionsFramework.list.arrayList;

import com.java17._10_collectionsFramework.list.arrayList.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.arrayList.agencia.Hotel;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);
//        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);


//        System.out.println(cadastroHotel.obterTodos());

        Hotel hotel = (Hotel) cadastroHotel.obterTodos().get(2);
        System.out.println(hotel);

        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();
//        hoteis.add("Hotel")
        System.out.println("Todos os Hoteis:");
        imprimirHoteis(hoteis);


        int indexOf = hoteis.indexOf(new Hotel("Mercure", "Uberlandia/MG", 400));
        System.out.println("\nIndice comecando do inicio ate o fim: " + indexOf);

        int lastIndexOf = hoteis.lastIndexOf(new Hotel("Mercure", "Uberlandia/MG", 400));
        System.out.println("Indice comecando fim ate o comeco: " + lastIndexOf);


        System.out.println("Substituindo objeto: ");
        hoteis.set(0, new Hotel("Novo Hotel", "Uberlandia/MG", 400));
        System.out.println("\nTodos os Hoteis:");
        imprimirHoteis(hoteis);


        System.out.println("\nRemovendo por cidade: Fortin/CE");
        cadastroHotel.removerPorCidade("Fortin/CE");
        imprimirHoteis(hoteis);

        System.out.println("\nRemovendo hotel: Mercure");
        cadastroHotel.remover(new Hotel("Mercure", "Uberlandia/MG", 400));
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);

            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
