package com.java17._18_optional.ciaaerea.exceptions;

public class PassageiroNaoEncontradoException extends RuntimeException{

    public PassageiroNaoEncontradoException(String message) {
        super(message);
    }

    public PassageiroNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
