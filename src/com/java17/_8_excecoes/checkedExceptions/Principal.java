package com.java17._8_excecoes.checkedExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\temp\\especialista-java\\abc\\java-17\\teste.txt");
        BufferedReader reader = null;
        try {

            reader = Files.newBufferedReader(arquivo);

            System.out.println(reader.readLine());


        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
//            e.printStackTrace();
        } finally {
            try {
                System.out.println("DEBUG: Fechando o leitor de arquivo!");
                reader.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o leitor de arquivo: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Erro ao fechar o leitor de arquivo: " + e.getMessage());
            }

        }

    }
}
