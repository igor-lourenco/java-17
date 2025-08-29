package com.java17._18_optional.desafio;

public record Cidade(String nome) {

//    Comentado pra forçar o erro na classe principal
//    public Cidade {
//        Objects.requireNonNull(nome, () -> {
//           throw new IllegalArgumentException("O nome da cidade não pode ser nulo");
//        });
//    }
}
