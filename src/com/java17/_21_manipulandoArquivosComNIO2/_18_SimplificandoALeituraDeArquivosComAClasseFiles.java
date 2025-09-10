package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _18_SimplificandoALeituraDeArquivosComAClasseFiles {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo.txt"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("1° forma de ler linha a linha do arquivo...");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        try (Stream<String> stream = Files.lines(arquivo, StandardCharsets.UTF_8)) {

            int numeroLinha = 1;

            for (String linha : stream.collect(Collectors.toList())) {
                System.out.println(numeroLinha + ". " + linha);
                numeroLinha++;
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("2° forma de ler linha a linha do arquivo ... (não recomendado para arquivos muitos grandes)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        try {
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);

            int numeroLinha = 1;
            for (String linha : linhas) {
                System.out.println(numeroLinha + ". " + linha);
                numeroLinha++;
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("3° forma de ler linha a linha do arquivo ... (para arquivos pequenos)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        try {
            String linhas = Files.readString(arquivo, StandardCharsets.UTF_8);

                System.out.println(linhas);

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("4° forma de obter o array de bytes do arquivo ... (para arquivos pequenos)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        try {
            byte[] bytes = Files.readAllBytes(arquivo);

            System.out.println("Conteúdo arquivo em array de bytes:");
            System.out.println(Arrays.toString(bytes));

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }

    }
}
