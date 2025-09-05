package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio;

import com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos.UnificadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {

        try {

            String pasta = "src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";
            File pastaOrigem = new File(pasta, "\\fotos\\viagens");

            File arquivoDestino = new File(pasta, "\\fotos\\viagens\\imagem-unificada.jpg");

            var unificador = new UnificadorDeArquivo(pastaOrigem,  arquivoDestino, "imagem-");

            unificador.unificar();

            System.out.println("\nUnificação concluída :-)");

        } catch (IOException e) {
            System.out.println("Erro ao fragmentar arquivo: " + e.getMessage());
        }
    }
}
