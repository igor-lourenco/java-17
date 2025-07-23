package com.java17._8_excecoes.estoque.exceptions;

public class ProdutoInativoException extends RuntimeException{

    public ProdutoInativoException(String message) {
        super(message);
    }
}
