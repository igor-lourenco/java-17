package com.java17._21_manipulandoArquivosComNIO2.desafio;


import com.java17._21_manipulandoArquivosComNIO2.desafio.modelos.EscritorArquivoMaiusculo;

import java.io.IOException;
import java.nio.file.Path;

public class Main3 {
    public static void main(String[] args) {

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        try {
            var e = new EscritorArquivoMaiusculo(
                pastaDocs1.resolve(Path.of("arquivo.txt")),
                pastaDocs1.resolve(Path.of("arquivo-copia.txt")));

            e.processar();

        } catch (IOException e) {
            System.out.println("Erro processamento e ecrevendo novo arquivo");
            e.printStackTrace();
        }
    }
}
