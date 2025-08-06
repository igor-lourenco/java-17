package com.java17._11_enumeracoes.antes;

public class ServicoCancelamentoPedido {

    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario) {

        pedido.cancelar();

        if(TipoUsuario.CLIENTE.equals(tipoUsuario)){
            System.out.println("DEBUG: Notificando gerente sobre cancelamento do pedido...");
        }
    }
}
