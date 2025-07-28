package com.java17._10_collectionsFramework.list.arrayList;

import com.java17._10_collectionsFramework.list.arrayList.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.arrayList.agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal2 {

    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);


        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();

        cadastroHotel.removerUsandoIterator("Fortin/CE");

        System.out.println("\nTodos os Hoteis:");
        imprimirHoteis(hoteis);



    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();

        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

//            hoteis.remove(0); // ConcurrentModificationException - não pode alterar a lista enquanto tiver iterando
        }


//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
    }

}
