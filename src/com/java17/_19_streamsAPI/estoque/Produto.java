package com.java17._19_streamsAPI.estoque;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Produto {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private Status status = Status.valueOf("ATIVO");
    private final Fabricante fabricante;
    private final Set<Categoria> categorias = new HashSet<>();

    public Produto(String nome, BigDecimal preco, int quantidade, Fabricante fabricante, Categoria... categorias) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.status = status;
        this.fabricante = fabricante;
        this.categorias.addAll(Set.of(categorias));
    }

    public Produto(String nome, BigDecimal preco, int quantidade, Fabricante fabricante, Status status,Categoria... categorias) {

        this(nome, preco, quantidade, fabricante, categorias);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void ativar(){
        this.status = Status.ATIVO;
    }

    public void inativar(){
        this.status = Status.INATIVO;
    }

    public boolean isAtivo(){
        return Status.ATIVO.equals(this.status);
    }
    public boolean isInativo(){
        return Status.INATIVO.equals(this.status);
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria){
        this.categorias.remove(categoria);
    }

    public boolean temEstoque(){
        return  getQuantidade() > 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
