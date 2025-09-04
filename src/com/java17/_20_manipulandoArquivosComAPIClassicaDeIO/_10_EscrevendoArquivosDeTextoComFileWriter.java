package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;
import java.util.Arrays;

public class _10_EscrevendoArquivosDeTextoComFileWriter {

    public static void main(String[] args) {
        System.out.println();

        String[] nomes = {"João", "Maria", "Sebastião", "José"};
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "docs1\\lista.txt");


        try (Writer escritor = new FileWriter(arquivo1)) {

            for (String nome : nomes) {
                escritor.write(nome + "\n"); // escreve no arquivo
            }

            System.out.println("Texto escrito: " + Arrays.toString(nomes));

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
