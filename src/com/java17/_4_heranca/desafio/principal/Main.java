package com.java17._4_heranca.desafio.principal;

import com.java17._4_heranca.desafio.entidades.Funcionario;
import com.java17._4_heranca.desafio.entidades.Holerite;
import com.java17._4_heranca.desafio.entidades.Programador;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao Green", 20.0);
        Holerite holerite1 = funcionario.gerarHolerite(160, "Janeiro");

        holerite1.imprimir();

        Programador programadora = new Programador("Jose Blue", 25.0);
        programadora.setValorBonus(100.0);

        Holerite holerite2 = programadora.gerarHolerite(160, "Janeiro");

        holerite2.imprimir();

        System.out.println(funcionario);
        System.out.println(programadora);
    }
}
