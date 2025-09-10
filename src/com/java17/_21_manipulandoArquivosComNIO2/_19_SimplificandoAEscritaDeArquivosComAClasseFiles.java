package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class _19_SimplificandoAEscritaDeArquivosComAClasseFiles {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo1.txt"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("1° forma de escrever no arquivo...");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        try {
            String linha = "Opa, Beleza? :-)";
            Files.writeString(arquivo, linha);
        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("2° forma de escrever no arquivo ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        try {
            List<String> linhas = Arrays.asList("Opa,", "Beleza?", ":-)");
//          Files.write(arquivo, linhas, StandardOpenOption.WRITE);
            Files.write(arquivo, linhas);


        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("3° forma de escrever no arquivo ... ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        byte[] bytes = new byte[]{66, 97, 116, 97, 116, 105, 110, 104, 97, 32, 113, 117, 97, 110, 100, 111, 32, 110, 97,
            115, 99, 101, 32, 101, 115, 112, 97, 108, 104, 97, 32, 97, 32, 114, 97, 109, 97, 32, 112, 101, 108, 111, 32,
            99, 104, -61, -93, 111, 13, 10, 13, 10, 13, 10, 77, 101, 110, 105, 110, 105, 110, 104, 97, 32, 113, 117, 97,
            110, 100, 111, 32, 100, 111, 114, 109, 101, 32, 112, -61, -75, 101, 32, 97, 32, 109, -61, -93, 111, 32, 110,
            111, 32, 99, 111, 114, 97, -61, -89, -61, -93, 111, 46, 13, 10, 13, 10, 13, 10, 79, 32, 115, 101, 117, 32,
            103, 114, 97, 117, 32, 100, 101, 32, 101, 109, 112, 111, 108, 103, 97, -61, -89, -61, -93, 111, 32, 99, 111,
            109, 32, 97, 32, 105, 110, 116, 101, 108, 105, 103, -61, -86, 110, 99, 105, 97, 32, 97, 114, 116, 105, 102,
            105, 99, 105, 97, 108, 32, -61, -87, 32, 105, 110, 118, 101, 114, 115, 97, 109, 101, 110, 116, 101, 32, 112,
            114, 111, 112, 111, 114, 99, 105, 111, 110, 97, 108, 32, 97, 32, 113, 117, 97, 110, 116, 105, 100, 97, 100,
            101, 32, 100, 101, 32, 99, 111, 110, 104, 101, 99, 105, 109, 101, 110, 116, 111, 32, 113, 117, 101, 32, 118,
            111, 99, -61, -86, 32, 116, 101, 109, 32, 101, 109, 32, 114, 101, 108, 97, -61, -89, -61, -93, 111, 32, 97,
            111, 32, 97, 115, 115, 117, 110, 116, 111, 46};

        try {

            Files.write(arquivo, bytes);

        } catch (IOException e) {
            throw new RuntimeException("Erro I/O: " + e.getMessage());
        }
    }
}
