package com.java17._10_collectionsFramework.list.arrayList;

import com.java17._10_collectionsFramework.list.arrayList.agencia.CadastroHotel;
import com.java17._10_collectionsFramework.list.arrayList.agencia.Hotel;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortin/CE", 1300);
        cadastroHotel.adicionar("Hotel Fazenda Dona Carolina", "Fortin/CE", 1400);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1500);
        cadastroHotel.adicionar("Mercure", "Uberlandia/MG", 400);


//        System.out.println(cadastroHotel.obterTodos());

        Hotel hotel = (Hotel) cadastroHotel.obterTodos().get(2);
        System.out.println(hotel);
    }

}
