package com.java17._21_manipulandoArquivosComNIO2.desafio;


import com.java17._21_manipulandoArquivosComNIO2.desafio.modelos.UnificadorDeArquivo;

import java.io.IOException;
import java.nio.file.Path;

public class Main2 {

    public static void main(String[] args) {

        try {

            Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
            Path pastaOrigem = pastaBase.resolve(Path.of("desafio\\fotos"));

            Path arquivoDestino = pastaOrigem.resolve(Path.of("imagem-unificada.jpg"));

//            String pasta = "src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";
//            File pastaOrigem = new File(pasta, "\\fotos\\viagens");
//
//            File arquivoDestino = new File(pasta, "\\fotos\\viagens\\imagem-unificada.jpg");

            var unificador = new UnificadorDeArquivo(pastaOrigem,  arquivoDestino, "imagem-");

            unificador.unificar();

            System.out.println("\nUnificação concluída :-)");

        } catch (IOException e) {
            System.out.println("Erro ao fragmentar arquivo: " + e.getMessage());
        }
    }
}
