package com.java17._10_collectionsFramework.list.vector.agencia;

import com.java17._10_collectionsFramework.list.PrecoHotelComparator;
import com.java17._10_collectionsFramework.list.arrayList.exception.HotelJaExistenteException;
import com.java17._10_collectionsFramework.list.arrayList.exception.HotelNaoEncontradoException;

import java.util.*;

public class CadastroHotel {

    private final Vector<Hotel> hoteis = new Vector<>();


    public void adicionar(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if(hoteis.contains(hotel)) throw new HotelJaExistenteException("Hotel ja foi adicionado");

        hoteis.add(hotel);
    }

    public Vector<Hotel> obterTodos (){
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


    public void removerUsandoIterator(String cidade){
        Iterator<Hotel> hotelIterator = hoteis.iterator();

        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();

            if (hotel.getCidade().equals(cidade)){
                System.out.printf("DEBUG: Removendo hotel: %s da cidade: %s%n", hotel.getNome(), hotel.getCidade());
                hotelIterator.remove(); // remove o ultimo elemento retornado pelo iterator
            }

        }
    }

    public void remover(Hotel hotel){
        boolean removido = hoteis.remove(hotel);

        if (!removido) throw new HotelNaoEncontradoException("Hotel nao encontrado para remocao!");
    }

    public Hotel[] obterTodosComArray (){
        return hoteis.toArray(new Hotel[0]);
    }

    public List<Hotel> obterTodosComList (){
        return hoteis.stream().toList();
    }

    public void ordenarPeloNomeUsandoComparable(){
        Collections.sort(this.hoteis);
    }

    public void ordenarPeloPrecoUsandoComparator(){
        this.hoteis.sort(new PrecoHotelComparator() // 1º ordenação pelo preco
            .reversed() // reverte a ordenação
            .thenComparing(
                Comparator.naturalOrder() // 2° ordenação pelo nome implementado no compareTo() da classe Hotel, caso tenha preços iguais
            ));

//        Outra forma diferente
//        Collections.sort(this.hoteis, new PrecoHotelComparator());
    }

}
