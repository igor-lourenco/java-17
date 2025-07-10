package com.java17._5_polimorfismoEClassesAbstratas;

import com.java17._5_polimorfismoEClassesAbstratas.banco.*;

public class Principal2 {


    public static void main(String[] args) {

        Titular titular = new Titular("Joao Green", "12312312390");

//      Upcasting implícito
        Conta conta = new ContaSalario(titular, 1234, 987654, 18000);

        System.out.println();
        System.out.println(conta);

    }
}
