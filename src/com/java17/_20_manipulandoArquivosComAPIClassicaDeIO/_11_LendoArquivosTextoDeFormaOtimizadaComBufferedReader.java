package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _11_LendoArquivosTextoDeFormaOtimizadaComBufferedReader {

    public static void main(String[] args) {
        System.out.println();
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "docs1\\lista.txt");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo1))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
