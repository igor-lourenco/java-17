package com.java17._8_excecoes.checkedExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\temp\\especialista-java\\java-17\\abc\\teste.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
