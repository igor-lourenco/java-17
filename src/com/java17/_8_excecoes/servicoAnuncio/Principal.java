package com.java17._8_excecoes.servicoAnuncio;

public class Principal {

    public static void main(String[] args) {

        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();

        servicoCadastroAnuncio.cadastrar("Aunucio123", "Registrando um novo anuncio");

        System.out.println("Anuncio cadastrado");
    }
}
