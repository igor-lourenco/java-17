package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.List;

public class Main5 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nQuantidade de itens vendidos:");
//        int quantidadeItensVendidos = 0;
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//
//                for (Venda.Item item : venda.getItens()) {
//                    quantidadeItensVendidos += item.quantidade();
//                }
//            }
//        }
//
//        System.out.println(quantidadeItensVendidos);

        int quantidadeItensVendidos= vendas.stream()
            .filter(Venda::isFechada)
            .flatMap(venda -> venda.getItens().stream())
            .mapToInt(Venda.Item::quantidade)
            .sum();

        System.out.println(quantidadeItensVendidos);

    }
}
