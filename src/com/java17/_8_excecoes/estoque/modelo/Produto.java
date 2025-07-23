package com.java17._8_excecoes.estoque.modelo;

import com.java17._8_excecoes.estoque.exceptions.ProdutoInativoException;
import com.java17._8_excecoes.estoque.exceptions.ProdutoSemEstoqueException;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !ativo;
    }

    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }


    public void retirarEstoque(int quantidade){
        if(quantidade < 0){
            throw  new IllegalArgumentException(String.format(
                "Quantidade nao pode ser negativa para retirada no estoque: %d", quantidade));
        }

        if(isInativo()){
            throw new ProdutoInativoException(String.format(
                "Retirada no estoque nao pode ser realizada com produto inativo: %b%n", ativo));
        }

        if(getQuantidadeEstoque() - quantidade < 0){
            throw new ProdutoSemEstoqueException("Quantidade invalida, porque estoque ficaria negativo");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
}
