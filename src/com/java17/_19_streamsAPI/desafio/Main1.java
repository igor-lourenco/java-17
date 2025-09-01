package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nVendas que estão com status fechada:");
//        for (Venda venda : vendas) {
//            if (venda.isFechada()){
//                System.out.println(venda);
//            }
//        }

        vendas.stream()
            .filter(Venda::isFechada)
            .forEach(System.out::println);
    }
}
