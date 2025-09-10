package com.java17._21_manipulandoArquivosComNIO2.desafio;


import com.java17._21_manipulandoArquivosComNIO2.desafio.modelos.FragmentadorDeArquivo;

import java.io.IOException;
import java.nio.file.Path;

public class Main1 {


    public static void main(String[] args) {

        try {

            Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
            Path pastaDocs1 = pastaBase.resolve(Path.of("desafio\\fotos"));

            Path arquivo = pastaDocs1.resolve(Path.of("imagem.jpg"));

            var fragmentador = new FragmentadorDeArquivo(arquivo,  1024 * 10);

            fragmentador.fragmentar();

            System.out.println("\nFragmentação concluída :-)");

        } catch (
            IOException e) {
            System.out.println("Erro ao fragmentar arquivo: " + e.getMessage());
        }
    }
}
