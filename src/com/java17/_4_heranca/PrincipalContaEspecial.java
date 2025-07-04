package com.java17._4_heranca;

import com.java17._4_heranca.banco.ContaEspecial;
import com.java17._4_heranca.banco.Titular;

public class PrincipalContaEspecial {


    public static void main(String[] args) {

        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("Joao Green", "12312312390"));
        conta1.setAgencia(1234);
        conta1.setNumero(987654);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

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
