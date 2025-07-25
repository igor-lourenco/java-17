package com.java17._9_generics.crm;

import com.java17._9_generics.crm.model.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

//        ArrayList<Cliente> clientes = new ArrayList<>();
        var clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermercado", 100_000));
        clientes.add(new Cliente("Posto Gasolina", 800_000));

//        clientes.add("Jose");

        double totalFaturamento = 0d;

//        for (Object object : clientes){
//            Cliente cliente = (Cliente) object;
//            totalFaturamento = totalFaturamento + cliente.getFaturamentoMensal();
//        }

        for (Cliente cliente : clientes){
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}
