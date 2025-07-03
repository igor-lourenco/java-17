package com.java17._4_heranca;

import com.java17._4_heranca.banco.Conta;
import com.java17._4_heranca.banco.Titular;

public class PrincipalContaEspecial {


    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Joao Green", "12312312390"));
        conta1.setAgencia(1234);
        conta1.setNumero(987654);
        conta1.setTipo(Conta.ESPECIAL);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();

    }

}
