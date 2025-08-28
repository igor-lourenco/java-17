package com.java17._17_expressoesLambdaEMethodReference.desafio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), false));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));


//      TODO: Removendo os funcionários inativos
        System.out.println("\nRemovendo funcionários inativos:");
        var funcionariosInativos = new ArrayList<>(funcionarios);
//      funcionariosInativos.removeIf(func -> func.isInativo());
        funcionariosInativos.removeIf(Funcionario::isInativo);

        funcionariosInativos.forEach(System.out::println);


//      TODO: Ordena funcionários pelo valor do salário
        System.out.println("\nOrdenando funcionários pelo valor do salário:");
        var ordenaFuncionariosPeloSalario = new ArrayList<>(funcionarios);
//      ordenaFuncionariosPeloSalario.sort(Comparator.comparing(func -> func.getSalario()));
        ordenaFuncionariosPeloSalario.sort(Comparator.comparing(Funcionario::getSalario));

        ordenaFuncionariosPeloSalario.forEach(System.out::println);


//      TODO: Iterar e imprimir funcionários usando o método estático imprimir
        System.out.println("\nIterando e imprimindo funcionários:");
//      funcionarios.forEach(func -> imprimir(func));
        funcionarios.forEach(Main::imprimir);
    }


    private static void imprimir(Funcionario funcionario){
//      TODO: Implementar a impressão do nome, salário e impostos (20%)
        NumberFormat numberFormat = new DecimalFormat("#,##0.00");
        BigDecimal porcentagemDeImposto = new BigDecimal("0.20");

        System.out.printf("Nome %s, salário de R$%s com 20%% de impostos devidos: %s%n",
            funcionario.getNome(),
            numberFormat.format(funcionario.getSalario()),
            numberFormat.format(funcionario.getSalario().multiply(porcentagemDeImposto)));
    }
}
