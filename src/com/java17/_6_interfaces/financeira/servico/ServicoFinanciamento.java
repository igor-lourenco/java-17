package com.java17._6_interfaces.financeira.servico;

import com.java17._6_interfaces.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {


    public void solicitarFinanciamento(ClienteFinanciavel clienteFinanciavel, double valorSolitado){
        double limiteAprovado = clienteFinanciavel.calcularLimiteAprovado();
        double jurosCalculado = clienteFinanciavel.calcularJuros(valorSolitado);


        if (limiteAprovado < valorSolitado){
            throw new RuntimeException(String.format(
                    "Financiamento nao aprovado. Limite maximo de %.2f", limiteAprovado));
        }

        // Registraríamos a solicitação do financimento aqui em alguma classe de persistência de dados, etc

        System.out.printf("DEBUG: Financiamento aprovado no valor de R$%.2f com juros de %.2f%%. Limite maximo de %.2f%n",
                valorSolitado, jurosCalculado,  limiteAprovado);
    }


    public double consultarLimiteAprovado(ClienteFinanciavel clienteFinanciavel){

        // Aqui poderia registrar a consulta em agum lugar para um consultor comercial entrar em
        // contato com o cliente por exemplo.

        return clienteFinanciavel.calcularLimiteAprovado();
    }
}
