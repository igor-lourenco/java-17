package com.java17._8_excecoes.desafio.banco.exceptions;

public class ContaInativaException extends RuntimeException{

    public ContaInativaException(String message) {
        super(message);
    }
}
