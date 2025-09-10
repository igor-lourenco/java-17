package com.java17._21_manipulandoArquivosComNIO2.desafio.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class EscritorArquivoMaiusculo {

    private Path pathOrigem;
    private Path pathDestino;


    public EscritorArquivoMaiusculo(Path pathOrigem, Path pathDestino) {
        this.pathOrigem = pathOrigem;
        this.pathDestino = pathDestino;
    }

    public void processar() throws IOException {

        try (BufferedReader leitor = Files.newBufferedReader(pathOrigem);
             BufferedWriter escritor = Files.newBufferedWriter(pathDestino, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {

            List<String> linhas = leitor.lines().collect(Collectors.toList());

            for (String linha : linhas) {
                escritor.write(linha.toUpperCase() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }
    }
}
