package com.java17._8_excecoes.estoque.exceptions;

public class ProdutoSemEstoqueException extends RuntimeException{

    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
