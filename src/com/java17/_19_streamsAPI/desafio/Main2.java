package com.java17._19_streamsAPI.desafio;

import com.java17._19_streamsAPI.desafio.comercial.Cliente;
import com.java17._19_streamsAPI.desafio.comercial.ServicoDeVenda;
import com.java17._19_streamsAPI.desafio.comercial.Venda;

import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        ServicoDeVenda servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodos();

        System.out.println("\nClientes que estão com venda com status fechada:");
//        List<Cliente> clientes = new ArrayList<>();
//        for (Venda venda : vendas) {
//            if(venda.isFechada() && !clientes.contains(venda.getCliente())){
//                clientes.add(venda.getCliente());
//            }
//        }
//
//        clientes.sort(Comparator.comparing(Cliente::nome));
//
//        for (Cliente cliente : clientes) {
//            System.out.println(cliente);
//        }

        vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getCliente)
            .sorted(Comparator.comparing(Cliente::nome))
            .distinct()
            .forEach(System.out::println);

    }
}
