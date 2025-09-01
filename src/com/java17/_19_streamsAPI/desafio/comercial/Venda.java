package com.java17._19_streamsAPI.desafio.comercial;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Venda {

    public enum Status{
        RASCUNHO, FECHADA, CANCELADA
    }

    private final Integer codigo;
    private final LocalDate data = LocalDate.now();
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private final Cliente cliente;
    private final List<Item> itens = new ArrayList<>();
    private Status status = Status.RASCUNHO;

    public Venda(Integer codigo, Cliente cliente) {
        Objects.requireNonNull(codigo, () -> {throw new IllegalArgumentException("O codigo não pode ser nulo");});
        Objects.requireNonNull(cliente, () -> {throw new IllegalArgumentException("O codigo não pode ser nulo");});
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isFechada(){
        return this.status.equals(Status.FECHADA);

    }
    public boolean isCancelada(){
        return this.status.equals(Status.CANCELADA);
    }

    public boolean isRascunho(){
        return this.status.equals(Status.RASCUNHO);
    }


    public void fechar(){
        this.status = Status.FECHADA;
    }

    public void cancelar(){
        this.status = Status.CANCELADA;
    }

    public void adicionarItem(Item item){
        itens.add(item);
        calcularValorTotal();
    }

    private void calcularValorTotal() {
//        BigDecimal valorTotal = BigDecimal.ZERO;
//
//        for(Item item : itens){
//            valorTotal = valorTotal.add(item.calcularValorTotal());
//        }
//
//        this.valorTotal = valorTotal;
//
        this.valorTotal = itens.stream()
            .map(item -> item.calcularValorTotal())
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public record Item(String descricao, int quantidade, BigDecimal precoUnitario){
        public BigDecimal calcularValorTotal(){
            return precoUnitario.multiply(new BigDecimal(quantidade));
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Venda{");
        sb.append("codigo=").append(codigo);
        sb.append(", data=").append(data);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append(", cliente=").append(cliente);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Venda venda = (Venda) object;
        return Objects.equals(codigo, venda.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
