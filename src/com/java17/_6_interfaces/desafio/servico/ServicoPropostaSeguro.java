package com.java17._6_interfaces.desafio.servico;

import com.java17._6_interfaces.desafio.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){

        System.out.println("\n-------------------------");
        System.out.println("Proposta de seguro");
        System.out.println("-------------------------");

        System.out.println(bem.descrever());
        System.out.printf("Premio: R$%.2f%n", bem.calcularValorPremio());

    }
}
