package com.java17._5_polimorfismoEClassesAbstratas.banco;

import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.Conta;
import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.ContaSalario;
import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.Titular;

public class Principal2 {


    public static void main(String[] args) {

        Titular titular = new Titular("Joao Green", "12312312390");

//      Upcasting implícito
        Conta conta = new ContaSalario(titular, 1234, 987654, 18000);

        System.out.println();
        System.out.println(conta);

    }
}
