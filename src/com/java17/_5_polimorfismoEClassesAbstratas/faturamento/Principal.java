package com.java17._5_polimorfismoEClassesAbstratas.faturamento;

import com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades.GestorFiscal;
import com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades.NotaFiscal;
import com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades.NotaFiscalProduto;
import com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {

        GestorFiscal gestorFiscal = new GestorFiscal();

        NotaFiscalProduto nfProduto = new NotaFiscalProduto("Bola de futebol", 300, 50);
        NotaFiscalServico nfServico = new NotaFiscalServico("Reparo da roda", 1_100, true);

        NotaFiscal nf = new NotaFiscal("Nota fiscal generica", 500);

        gestorFiscal.emitirNotasFiscais(nfProduto, nfServico, nf);

//        System.out.println();
//        nfProduto.emitirNotaFiscal();
//        nfServico.emitirNotaFiscal();
    }
}
