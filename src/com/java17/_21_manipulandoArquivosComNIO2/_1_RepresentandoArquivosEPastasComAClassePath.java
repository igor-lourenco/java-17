package com.java17._21_manipulandoArquivosComNIO2;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class _1_RepresentandoArquivosEPastasComAClassePath {

    public static void main(String[] args) {
        System.out.println();

        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println("1. Implementação interna representando o sistema de arquivos: " + fileSystem);

        Path caminho1 = fileSystem.getPath(
            "C:\\temp\\especialista-java\\java-17\\src\\com\\java17\\_21_manipulandoArquivosComNIO2\\docs\\contrato.txt");

        System.out.println("2. Representando caminho do arquivo: " + caminho1);
        System.out.println("3.Nome do arquivo: " + caminho1.getFileName());
        System.out.println("4.Pasta pai do arquivo: " + caminho1.getParent());


        Path caminho2 = Path.of("C:\\temp\\especialista-java\\java-17\\src\\com\\java17\\_21_manipulandoArquivosComNIO2\\docs\\contrato.txt");
        System.out.println("\n1. Forma mais otimizada de obter a representação do Path: " + caminho2);

        File file = caminho2.toFile();
        System.out.println("2. Convertendo Path do NIO2 para File da API clássica: " + file);
        Path caminho3 = file.toPath();
        System.out.println("3. Convertendo File da API clássica para Path do NIO2: " + caminho3);
    }
}
