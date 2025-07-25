package com.java17._9_generics.pesquisa;

import com.java17._9_generics.pesquisa.modelo.Funcionario;
import com.java17._9_generics.pesquisa.modelo.Cliente;
import com.java17._9_generics.pesquisa.modelo.Pesquisador;

public class Principal {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
          new Funcionario("Joao", 18),
          new Funcionario("Jose", 19),
          new Funcionario("Maria", 20),
          new Funcionario("Marcos", 20)
        };

        Cliente[] clientes = {
            new Cliente("Supermercado", 100_000),
            new Cliente("Posto Gasolina", 800_000),
            new Cliente("Empresa", 800_000),
            new Cliente("Consultoria", 58_000)
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterPorNome("Jose", funcionarios);
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome("Supermercado", clientes);
        System.out.println(clienteEncontrado);
    }
}
