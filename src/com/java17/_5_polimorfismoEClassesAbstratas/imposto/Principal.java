package com.java17._5_polimorfismoEClassesAbstratas.imposto;

import com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades.EmpresaLucroReal;
import com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades.EmpresaSimples;
import com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades.GestorDeImpostos;
import com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades.PessoaFisica;

public class Principal {

    public static void main(String[] args) {

        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica joao = new PessoaFisica("Joao da Silva", 45_500);
        PessoaFisica maria = new PessoaFisica("Maria dos Santos", 180_000);

        EmpresaSimples barDoZe = new EmpresaSimples("Bar do Ze", 250_000, 160_000);
        EmpresaLucroReal codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);
        gestorDeImpostos.adicionar(barDoZe);
        gestorDeImpostos.adicionar(codeConsultoria);

        System.out.printf("%nTotal de impostos: %.2f", gestorDeImpostos.getValorTotalImpostos());
        System.out.println();
    }
}
