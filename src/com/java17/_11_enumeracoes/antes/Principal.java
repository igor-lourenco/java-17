package com.java17._11_enumeracoes.antes;

public class Principal {

    public static void main(String[] args) {

        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Joao da Silva");

        pedido.setStatus(StatusPedido.EMITIDO);
        pedido.setOrigem(OrigemPedido.ONLINE);

        System.out.println("Status do pedido: " + pedido.getStatus());
        System.out.println("Origem do pedido: " + pedido.getOrigem());

        System.out.println("Tempo de entrega em horas: " + pedido.getTempoEntregaEmHoras());

        pedido.setValorTotal(90);
        servico.cancelar(pedido, TipoUsuario.CLIENTE);

        System.out.println("Status do pedido: " + pedido.getStatus());
    }
}
