package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _9_LendoArquivosDeTextoComFileReader {

    public static void main(String[] args) {
        System.out.println();
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "docs1\\contrato1.txt");
        StringBuilder texto = new StringBuilder();


        try (Reader leitor = new FileReader(arquivo1)) {

            char[] conteudo = new char[1000]; // lê arquivo a cada 1000 character
            int quantidadeCharacterLido;

            while ((quantidadeCharacterLido = leitor.read(conteudo)) > 0) {

                texto.append(conteudo, 0, quantidadeCharacterLido);
            }

            System.out.println("Texto lido:");
            System.out.println(texto);

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
