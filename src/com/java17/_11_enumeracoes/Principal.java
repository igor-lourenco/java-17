package com.java17._11_enumeracoes;

import com.java17._11_enumeracoes.antes.StatusPedido;

public class Principal {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Nome do Enum: " + StatusPedido.EMITIDO);
        System.out.printf(
            "Numero que representa o Enum %s: %d%n", StatusPedido.EMITIDO, StatusPedido.EMITIDO.ordinal());


        System.out.println();
        System.out.println("Listando todos os valores do Enum StatusPedido");
        StatusPedido[] values = StatusPedido.values();
        for (StatusPedido value : values) {
            System.out.printf("%d - %s%n", value.ordinal(), value);
        }


        System.out.println();
        System.out.println("Convertendo uma String em Enum do tipo StatusPedido:");
        String status = "CANCELADO";
        StatusPedido statusPedido = StatusPedido.valueOf(status);
        System.out.printf("%d - %s%n", statusPedido.ordinal(), statusPedido);


        System.out.println();
        System.out.println("Convertendo um numero em Enum do tipo StatusPedido:");
        int numero = 2;
        StatusPedido status2 = StatusPedido.values()[numero];
        System.out.printf("%d - %s%n", status2.ordinal(), status2);


    }
}
