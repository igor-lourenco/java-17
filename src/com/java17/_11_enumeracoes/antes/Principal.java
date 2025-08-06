package com.java17._11_enumeracoes.antes;

public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Joao da Silva");

        pedido.setStatus(StatusPedido.FATURADO);
        pedido.setOrigem(OrigemPedido.ONLINE);

        System.out.println(pedido.getStatus());
        System.out.println(pedido.getOrigem());

        System.out.println("Tempo de entrega em horas: " + pedido.getTempoEntregaEmHoras());
    }
}
