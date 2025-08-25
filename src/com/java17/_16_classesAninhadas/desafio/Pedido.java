package com.java17._16_classesAninhadas.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public static enum StatusEnum {
        CRIADO, EMITIDO
    }


    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private static StatusEnum status = StatusEnum.CRIADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public ItemPedido adicionarItem(String descricao, int quantidade, BigDecimal valor) {
        ItemPedido item = new ItemPedido(descricao, quantidade, valor);
        this.itens.add(item);

        return item;
    }

    public BigDecimal getValorTotal() {
        BigDecimal valor = BigDecimal.ZERO;

        for (ItemPedido item : itens) {
            valor = valor.add(item.getValorTotal());
        }

        return valor;
    }

    public void emitir() {
        this.status = StatusEnum.EMITIDO;
    }


    public static class ItemPedido {

        private String descricao;
        private int quantidade;
        private BigDecimal valorUnitario;

        public ItemPedido(String descricao, int quantidade, BigDecimal valor) {
            this.descricao = descricao;
            this.quantidade = quantidade;
            this.valorUnitario = valor;
        }

        public String getDescricao() {
            return descricao;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        public BigDecimal getValorTotal() {
            return valorUnitario.multiply(new BigDecimal(
                String.valueOf(quantidade)));
        }

        public void setQuantidade(int quantidade) {
            if (!status.equals(StatusEnum.CRIADO)) {
                throw new IllegalArgumentException("Pedido não pode ser modificado");
            }

            this.quantidade = quantidade;
        }
    }
}
