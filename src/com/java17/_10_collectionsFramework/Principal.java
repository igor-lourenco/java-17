package com.java17._10_collectionsFramework;

import com.java17._10_collectionsFramework.comercial.modelo.Cliente;
import com.java17._10_collectionsFramework.comercial.modelo.ItemVenda;
import com.java17._10_collectionsFramework.comercial.modelo.Venda;

public class Principal {

    public static void main(String[] args) {

        ItemVenda mouse = new ItemVenda("Magic Mouse", 700);
        ItemVenda adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        ItemVenda macBookPro = new ItemVenda("Mac Book Pro", 15_000);
        ItemVenda limpaTela = new ItemVenda("Limpa tela", 70);

        Cliente cliente = new Cliente("Joao da Silva", 2_000);
        Venda venda = new Venda(cliente);

        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);

//      Solta exception porque está sendo retornado uma Collection não-modificável ao invés da lista da instância
//      venda.getItens().add(macBookPro);

        System.out.println(venda.getValorTotal());
        System.out.println(venda.getItens());

    }
}
