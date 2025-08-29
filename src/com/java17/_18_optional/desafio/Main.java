package com.java17._18_optional.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Av Rondon Pacheco", "2000", "Santa Maria");
        Endereco endereco2 = new Endereco("Av Afonso Pena", "3000", "Centro", new Cidade("Uberlândia"));
        Endereco endereco3 = new Endereco("Av Afonso Pena", "3000", "Centro", new Cidade(null));
        Endereco endereco4 = new Endereco("Av João Neves", "1000", "Santa Mônica", new Cidade("Uberlândia"));
        endereco3.setResidenciaPropria(true);
        endereco4.setResidenciaPropria(true);

        Cliente cliente = null;
        Cliente cliente1 = new Cliente("João da Silva"); // Sem endereço
        Cliente cliente2 = new Cliente("Sebastião Coelho", endereco1); // Endereço sem cidade
        Cliente cliente3 = new Cliente("Manoel Filho", endereco2); // Sem residência própia
        Cliente cliente4 = new Cliente("Maria da Silva", endereco3); // Cidade com nome nulo
        Cliente cliente5 = new Cliente("Carlos Magalhães", endereco4);

        List<Cliente> clientes = Arrays.asList(
            cliente, cliente1, cliente2, cliente3, cliente4, cliente5);

        System.out.println();

        clientes.forEach(cli -> {
            try {
                System.out.println("\nCidade: " + obterNomeCidadeResidencialPropria(cli));

            } catch (IllegalArgumentException e) {
                System.out.println("Erro cliente: " + e.getMessage());
            }
        });

    }

    private static String obterNomeCidadeResidencialPropria(Cliente cliente) {
        Objects.requireNonNull(cliente, () -> {
            throw new IllegalArgumentException("Cliente não pode ser nulo");
        });

        return cliente.getEndereco()
            .filter(end -> end.isResidenciaPropria())
            .orElseThrow(() -> new IllegalArgumentException("Não foi encontrado endereço com residência própria do cliente"))
            .getCidade()
            .filter(cidade -> cidade.nome() != null)
            .orElseThrow(() -> new IllegalArgumentException("Não foi encontrado cidade da residência própria do cliente"))
            .nome();

//        =========== Antes de usar Optional ===============
//        Endereco endereco = cliente.getEndereco();
//        Cidade cidade = null;
//        if(endereco != null && endereco.isResidenciaPropria()){
//            cidade = endereco.getCidade();
//        }
//        if (cidade != null){
//            return cidade.nome();
//        }

//        throw new IllegalArgumentException("Não foi encontrado cidade da residência própria do cliente");

    }
}
