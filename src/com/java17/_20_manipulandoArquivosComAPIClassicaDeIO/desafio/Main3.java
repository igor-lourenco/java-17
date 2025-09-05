package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio;

import com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos.EscritorArquivoMaiusculo;

import java.io.File;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) {

        String pasta = "src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";

        try {

            var e = new EscritorArquivoMaiusculo(
                new File(pasta, "docs2\\poema1.txt"),
                new File(pasta, "docs2\\poema2.txt"));

            e.processar();

        } catch (IOException e) {
            System.out.println("Erro processamento e ecrevendo novo arquivo");
            e.printStackTrace();
        }

    }
}
