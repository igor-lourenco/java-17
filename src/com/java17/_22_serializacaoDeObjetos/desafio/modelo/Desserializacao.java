package com.java17._22_serializacaoDeObjetos.desafio.modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Desserializacao {

    public static void main(String[] args) {

        Path pastaBase = Path.of("src\\com\\java17\\_22_serializacaoDeObjetos");
        Path pastaObjetos = pastaBase.resolve(Path.of("objetos"));
        Path arquivoObjetoSerializado = pastaObjetos.resolve(Path.of("cliente.ser"));

        try (var outputStream = new ObjectInputStream(Files.newInputStream(arquivoObjetoSerializado,
            StandardOpenOption.READ))) {

            if (outputStream.readObject() instanceof Cliente cliente) {
                System.out.println("\nUSANDO A API NIO");
                System.out.println("Objeto desserializado:");
                System.out.println(cliente);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Erro de I/O: " + e.getMessage());
        }
    }
}
