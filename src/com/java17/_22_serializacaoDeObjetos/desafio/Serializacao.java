package com.java17._22_serializacaoDeObjetos.desafio;

import com.java17._22_serializacaoDeObjetos.desafio.modelo.Cliente;
import com.java17._22_serializacaoDeObjetos.desafio.modelo.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Serializacao {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));
        System.out.println();
        System.out.println(cliente);

        Path pastaBase = Path.of("src\\com\\java17\\_22_serializacaoDeObjetos");
        Path pastaObjetos = pastaBase.resolve(Path.of("objetos"));
        Path arquivoObjetoSerializado = pastaObjetos.resolve(Path.of("cliente.ser"));

        try(var outputStream = new ObjectOutputStream(Files.newOutputStream(arquivoObjetoSerializado,
            StandardOpenOption.WRITE, StandardOpenOption.CREATE))){

            outputStream.writeObject(cliente);
            System.out.printf("Objeto Serializado para o arquivo: %s  :-)%n", arquivoObjetoSerializado);

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O: " + e.getMessage());
        }
    }
}
