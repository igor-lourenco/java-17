package com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades;

public class GestorFiscal {


    public void emitirNotasFiscais(NotaFiscal... notaFiscals){

        System.out.println("\nEmitindo as notas fiscais: " + notaFiscals.length);

        for (NotaFiscal notaFiscal: notaFiscals){

            notaFiscal.emitirNotaFiscal();
            System.out.println("------------------------");
        }
    }
}
