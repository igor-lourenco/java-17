package com.java17._5_polimorfismoEClassesAbstratas.banco;

import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.*;

public class PrincipalCaixaEletronico {


    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular1 = new Titular("Joao Green", "12312312390");
        ContaEspecial contaEspecial1 = new ContaEspecial(titular1, 1234, 999999, 90);
        contaEspecial1.setLimiteChequeEspecial(1000.0);

        Titular titular2 = new Titular("Maria Blue", "12312312390");
        ContaEspecial contaEspecial2 = new ContaEspecial(titular2, 4321, 111111, 90);

        Titular titular3 = new Titular("Jose White", "12312312390");
        ContaSalario contaSalario = new ContaSalario(titular3, 9876, 222222, 18000.0);

        contaEspecial1.depositar(300.0);

        System.out.println("--------------------------------------------------");
        caixaEletronico.transferir(contaEspecial1, contaEspecial2, 50);

        contaEspecial1.imprimirDemonstrativo();
        contaEspecial2.imprimirDemonstrativo();

        contaEspecial2.creditarRendimentos(5);

        System.out.println("--------------------------------------------------");
        caixaEletronico.transferir(contaEspecial1, contaSalario, 50);

        contaEspecial1.imprimirDemonstrativo();
        contaSalario.imprimirDemonstrativo();

        System.out.println("--------------------------------------------------");

        Titular titular4 = new Titular("John red", "12312312390");
        ContaInvestimento contaInvestimento = new ContaInvestimento(titular4, 6789, 555555);
        contaInvestimento.depositar(100);
        contaInvestimento.creditarRendimentos(5.0);

        caixaEletronico.imprimirDemonstrativo(contaEspecial2);

    }
}
