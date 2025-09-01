package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.List;
import java.util.stream.Collectors;

public class Main7 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        vendas.stream().forEach(System.out::println);

        System.out.println("\nQuantidade de vendas por cliente:");
//        Map<String, Long> vendasRealizadasPorCliente = new HashMap<>();
//
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                String nomeCliente = venda.getCliente().nome();
//                Long quantidadeVendas = vendasRealizadasPorCliente.get(nomeCliente);
//
//                if (quantidadeVendas == null) {
//                    quantidadeVendas = 0L;
//                }
//
//                vendasRealizadasPorCliente.put(nomeCliente, quantidadeVendas + 1);
//            }
//        }
//
//        System.out.println(vendasRealizadasPorCliente);

        vendas.stream()
            .filter(Venda::isFechada)
            .distinct()
            .collect(Collectors.groupingBy(venda -> venda.getCliente().nome(),
                Collectors.counting()))
            .forEach((cliente, vendasVendidas) -> {
                System.out.println("Cliente: " + cliente + ", tem " + vendasVendidas + " vendas fechadas");
            });

    }
}
