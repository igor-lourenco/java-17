package com.java17._8_excecoes.servicoCadastro;

import com.java17._8_excecoes.servicoCadastro.exceptions.MenorDeIdadeException;
import com.java17._8_excecoes.servicoCadastro.modelo.Cliente;
import com.java17._8_excecoes.servicoCadastro.servico.ServicoCadastroCliente;

public class Principal {

    public static void main(String[] args) {

        try {
            ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
            Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("Joao", 15);
            System.out.printf("%nCliente cadastrado: %s%n", clienteCadastrado.getNome());

        } catch (MenorDeIdadeException e) {
            System.out.println("\nNao foi possivel cadastrar cliente: " + e.getMessage());
        }

    }
}
