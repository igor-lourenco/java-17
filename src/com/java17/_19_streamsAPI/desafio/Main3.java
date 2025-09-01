package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nDescrição dos produtos que estão com venda com status fechada");
//        List<String> descricoes = new ArrayList<>();
//        for (Venda venda : vendas) {
//            if (venda.isFechada()){
//
//                for (Venda.Item item : venda.getItens()) {
//                    if(!descricoes.contains(item.descricao())){
//                        descricoes.add(item.descricao());
//                    }
//                }
//            }
//        }
//
//        Collections.sort(descricoes);
//
//        for (String descricao : descricoes) {
//            System.out.println(descricao);
//        }

        vendas.stream()
            .filter(Venda::isFechada)
            .flatMap(venda -> venda.getItens().stream())
            .map(Venda.Item::descricao)
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }
}
