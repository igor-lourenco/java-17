package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nNome dos clientes que estão com a venda com status fechada:");
//        List<String> clientes = new ArrayList<>();
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                if (!clientes.contains(venda.getCliente().nome())) {
//                    clientes.add(venda.getCliente().nome());
//                }
//            }
//        }
//
//        Collections.sort(clientes);
//        System.out.println(clientes);
        vendas.stream()
            .filter(Venda::isFechada)
            .map(venda -> venda.getCliente().nome())
            .sorted()
            .distinct()
            .forEach(System.out::println);

    }
}
