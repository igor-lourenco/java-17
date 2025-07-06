package com.java17._4_heranca;

import com.java17._4_heranca.banco.Conta;
import com.java17._4_heranca.banco.Titular;

public class PrincipalContaNormal {


    public static void main(String[] args) {

        Titular titular = null;// new Titular("Joao Green", "12312312390");
        Conta conta1 = new Conta(titular, 1234, 987654);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(99);
        conta1.imprimirDemonstrativo();

        System.out.println(conta1);

    }
}
