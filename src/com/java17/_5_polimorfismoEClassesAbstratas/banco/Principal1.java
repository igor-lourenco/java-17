package com.java17._5_polimorfismoEClassesAbstratas.banco;

import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.Conta;
import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.ContaEspecial;
import com.java17._5_polimorfismoEClassesAbstratas.banco.entidades.Titular;

public class Principal1 {


    public static void main(String[] args) {

        Titular titular = new Titular("Joao Green", "12312312390");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 987654, 90);

        contaEspecial.setLimiteChequeEspecial(1000.0);
        contaEspecial.depositar(100.0);


//      Upcasting implícito, na memória heap o objeto continua sendo da subclasse ContaEspecial
//      O que muda é apenas como o objeto está sendo acessado
        Conta conta = contaEspecial;

        conta.sacar(200);

        System.out.println();
        System.out.println(contaEspecial);
        System.out.println(conta);
        System.out.println(conta == contaEspecial);

    }
}
