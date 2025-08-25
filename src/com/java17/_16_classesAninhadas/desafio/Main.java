package com.java17._16_classesAninhadas.desafio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    private static final NumberFormat FORMATADOR_MOEDA = NumberFormat.getCurrencyInstance(
        new Locale("pt", "BR"));

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joao");
        Pedido pedido = new Pedido(cliente);

        Pedido.ItemPedido item1 = pedido.adicionarItem("Iphone 14", 3, new BigDecimal("12000"));
        Pedido.ItemPedido item2 = pedido.adicionarItem("Apple Watch", 3, new BigDecimal("5900"));

        imprimirResumo(pedido);

        System.out.println("-----------");
        item1.setQuantidade(10);
        imprimirResumo(pedido);

//        pedido.emitir();
        item1.setQuantidade(20); // não pode alterar pedido após ser emitido

        System.out.println("-----------");
        imprimirResumo(pedido);


    }

    private static void imprimirResumo(Pedido pedido){

        for (Pedido.ItemPedido item : pedido.getItens()) {

            System.out.printf("%dx %s (%s) = %s%n",
                item.getQuantidade(),
                item.getDescricao(),
                FORMATADOR_MOEDA.format(item.getValorUnitario()),
                FORMATADOR_MOEDA.format(item.getValorTotal()));
        }

        System.out.printf("Total: %s%n", FORMATADOR_MOEDA.format(pedido.getValorTotal()));
    }
}
