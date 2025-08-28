package com.java17._18_optional.ciaaerea.exceptions;

public class ReservaNaoEncontradaException extends RuntimeException{

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }

    public ReservaNaoEncontradaException(String message, Throwable cause) {
        super(message, cause);
    }
}
