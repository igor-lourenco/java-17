package com.java17._10_collectionsFramework.list.arrayList.agencia;

import com.java17._10_collectionsFramework.list.arrayList.exception.HotelJaExistenteException;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>(10);


    public void adicionar(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if(hoteis.contains(hotel)) throw new HotelJaExistenteException("Hotel ja foi adicionado");

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos (){
        return hoteis;
    }

}
