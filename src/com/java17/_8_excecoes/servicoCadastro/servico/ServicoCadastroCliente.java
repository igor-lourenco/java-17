package com.java17._8_excecoes.servicoCadastro.servico;

import com.java17._8_excecoes.servicoCadastro.exceptions.MenorDeIdadeException;
import com.java17._8_excecoes.servicoCadastro.modelo.Cliente;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) throws MenorDeIdadeException {

        if (idade < 18) {
            throw new MenorDeIdadeException("Cliente menor de idade nao pode ser cadastrado");
        }

        // aqui seria a regra de negocio para cadastro


        return new Cliente(nome, idade);
    }
}
