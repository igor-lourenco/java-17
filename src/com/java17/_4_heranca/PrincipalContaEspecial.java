package com.java17._4_heranca;

import com.java17._4_heranca.banco.ContaEspecial;
import com.java17._4_heranca.banco.Titular;

public class PrincipalContaEspecial {


    public static void main(String[] args) {

        Titular titular = new Titular("Joao Green", "12312312390");
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 987654, 90);

        conta1.setLimiteChequeEspecial(1000);
        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        System.out.println();
        System.out.println(">>> Debitando a tarifa mensal da Conta Especial");
        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();

    }
}
