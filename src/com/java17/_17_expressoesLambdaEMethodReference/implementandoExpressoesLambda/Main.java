package com.java17._17_expressoesLambdaEMethodReference.implementandoExpressoesLambda;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };


//        Filtro<Cliente> filtro = (Cliente objeto) -> {
//            boolean resultado = objeto.getIdade() > 40;
//            return resultado;
//        };


        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);


        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }


        List<Cliente> clientes2 = cadastroCliente.getClientes();
        clientes2.sort((c1, c2) -> Integer.compare(c1.getIdade(), c2.getIdade()));


        System.out.println("-----------------");
        System.out.println("Ordenando pela idade:");
        for (Cliente cliente : clientes2) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }
}
