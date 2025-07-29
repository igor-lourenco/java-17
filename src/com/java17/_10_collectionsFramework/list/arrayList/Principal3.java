package com.java17._10_collectionsFramework.list.arrayList;

import com.java17._10_collectionsFramework.list.arrayList.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.arrayList.agencia.Hotel;

import java.util.ArrayList;
import java.util.ListIterator;

public class Principal3 {

    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);


        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();

        System.out.println("\nTodos os Hoteis:");
        imprimirHoteisDeTrasParaFrente(hoteis);
    }

    private static void imprimirHoteisDeTrasParaFrente(ArrayList<Hotel> hoteis) {
        ListIterator<Hotel> hotelListIterator = hoteis.listIterator(hoteis.size()); // para começar do final

        while (hotelListIterator.hasPrevious()){ // do final ao inicio
            Hotel hotel = hotelListIterator.previous(); // move o cursor para o anterior
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }

    }

}
