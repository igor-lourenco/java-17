package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _12_EscrevendoArquivosTextoDeFormaOtimizadaComBufferedWriter {

    public static void main(String[] args) {
        System.out.println();
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "docs1\\lista.txt");
        File arquivo2 = new File(pasta1, "docs1\\lista-copia.txt");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo1));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo2))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {
               escritor.write(linha + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
