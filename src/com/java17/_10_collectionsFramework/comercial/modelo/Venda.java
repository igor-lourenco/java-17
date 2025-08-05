package com.java17._10_collectionsFramework.comercial.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(ItemVenda itemVenda){

        if(excedeuLimiteCompra(itemVenda)) throw new IllegalArgumentException(String.format(
            "Limite atual: %.2f%n", this.cliente.getLimiteCompras()
        ));

        this.valorTotal = this.valorTotal + itemVenda.getValor();
        this.itens.add(itemVenda);
    }

    private boolean excedeuLimiteCompra(ItemVenda itemVenda){
        return this.valorTotal + itemVenda.getValor() > getCliente().getLimiteCompras();
    }
}
