package com.java17._10_collectionsFramework.list.arrayList.agencia;

import com.java17._10_collectionsFramework.list.arrayList.exception.HotelJaExistenteException;
import com.java17._10_collectionsFramework.list.arrayList.exception.HotelNaoEncontradoException;

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

    public void removerPorCidade(String cidade){
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);

            if (hotel.getCidade().equals(cidade)){
                hoteisParaRemocao.add(hotel);
            }
        }

        this.hoteis.removeAll(hoteisParaRemocao);
    }


    public void remover(Hotel hotel){
        boolean removido = hoteis.remove(hotel);

        if (!removido) throw new HotelNaoEncontradoException("Hotel nao encontrado para remocao!");
    }

}
