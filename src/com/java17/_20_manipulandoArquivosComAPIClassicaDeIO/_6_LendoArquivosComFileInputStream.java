package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _6_LendoArquivosComFileInputStream {

    public static void main(String[] args) {
        System.out.println();
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "docs1\\contrato1.txt");

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(arquivo1);

            int byteLido;
            StringBuilder conteudoLido = new StringBuilder();

            while ((byteLido = inputStream.read()) != -1){
                System.out.println("byte: " + byteLido + ", char: " + (char) byteLido);
                conteudoLido.append((char) byteLido);
            }

            System.out.println("\nObservação: Não é melhor forma para trabalhar com arquivos texto, é apenas pra trabalhar com bytes");
            System.out.println("Conteúdo lido: " + conteudoLido);

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        } finally {

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("DEBUG: Erro ao fechar fluxo de entrada!");;
                }
            }
        }

    }
}
