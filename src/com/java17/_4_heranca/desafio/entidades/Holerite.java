package com.java17._4_heranca.desafio.entidades;

public record Holerite (
    String nome,
    String mesAno,
    double valorSalario) {


    public void imprimir(){

        System.out.println();
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Mes: %s%n", mesAno);
        System.out.printf("Salario: %.2f%n", valorSalario);
        System.out.println();
    }

}
