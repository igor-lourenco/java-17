package com.java17._4_heranca;

import com.java17._4_heranca.banco.ContaInvestimento;
import com.java17._4_heranca.banco.Titular;

public class PrincipalContaInvestimento {


    public static void main(String[] args) {

        Titular titular = new Titular("Joao Green", "12312312390");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 987654);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(99);
        conta1.imprimirDemonstrativo();

        System.out.println();
        System.out.println(">>> Adicionando o creditar rendimentos da Conta Investimento:");
        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}
