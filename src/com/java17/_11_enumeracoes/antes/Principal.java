package com.java17._11_enumeracoes.antes;

public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Joao da Silva");

        pedido.setStatus(Pedido.STATUS_EMITIDO);
        pedido.setOrigem(Pedido.ORIGEM_BALCAO);

        System.out.println(Pedido.getDescricaoStatus(pedido.getStatus()));

    }
}
