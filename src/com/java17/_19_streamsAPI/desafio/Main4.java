package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.math.BigDecimal;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nTotal de vendas:");
//        BigDecimal totalVendas = BigDecimal.ZERO;
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                totalVendas = totalVendas.add(venda.getValorTotal());
//            }
//        }
//
//        System.out.println(totalVendas);

        vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getValorTotal)
            .reduce(BigDecimal::add)
            .ifPresentOrElse(System.out::println,
                () -> System.out.println(BigDecimal.ZERO));
    }
}
