package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio;

import com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Main1 {


    public static void main(String[] args) {


        try {

            String formatoArquivo = ".jpg";
            String pasta = "src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";
            File fileOrigem = new File(pasta, "\\fotos\\viagens\\imagem");


            var fragmentador = new FragmentadorDeArquivo(fileOrigem,  formatoArquivo, 1024 * 10);

            fragmentador.fragmentar();

            System.out.println("Fragmentação concluída :-)");

        } catch (IOException e) {
            System.out.println("Erro ao fragmentar arquivo: " + e.getMessage());
        }
    }
}
