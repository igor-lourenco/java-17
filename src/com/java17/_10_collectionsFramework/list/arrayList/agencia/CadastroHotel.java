package com.java17._10_collectionsFramework.list.arrayList.agencia;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList hoteis = new ArrayList<>(10);


    public void adicionar(String nome, String cidade, double precoDiaria){
        hoteis.add(new Hotel(nome, cidade, precoDiaria));
    }

    public ArrayList obterTodos (){
        return hoteis;
    }

}
