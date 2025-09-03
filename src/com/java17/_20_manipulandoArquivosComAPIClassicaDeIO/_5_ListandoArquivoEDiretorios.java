package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.File;

public class _5_ListandoArquivoEDiretorios {

    public static void main(String[] args) {

        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
//        File arquivo1 = new File(pasta1, "contrato1.txt");

        File[] listaDeArquivosEPastas = pasta1.listFiles();
        System.out.println("\nListando todos os arquivos e pastas que estão na pasta: " + pasta1.getName());

        if (listaDeArquivosEPastas != null) {
            for (File file : listaDeArquivosEPastas) {
                System.out.println(file);
            }
        } else {
            System.out.printf("Pasta %s está vazia%n", pasta1.getName());
        }

        System.out.println("===========================================");

        File[] arquivos = pasta1.listFiles(File::isFile);
        System.out.println("\nListando todos os arquivos que estão na pasta: " + pasta1.getName());

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        } else {
            System.out.printf("Pasta %s está vazia%n", pasta1.getName());
        }

        System.out.println("===========================================");

        File[] diretorios = pasta1.listFiles(File::isDirectory);
        System.out.println("\nListando todos os diretórios que estão na pasta: " + pasta1.getName());

        if (diretorios != null) {
            for (File diretorio : diretorios) {
                System.out.println(diretorio.getName());
            }
        } else {
            System.out.printf("Pasta %s está vazia%n", pasta1.getName());
        }

        System.out.println("===========================================");

        File[] filtro = pasta1.listFiles((diretorio, arquivo) -> arquivo.contains("c"));
        System.out.println("\nFiltrando todos os diretórios e arquivos que estão na pasta: " + pasta1.getName());

        if (filtro != null) {
            for (File file : filtro) {
                System.out.println(file.getName());
            }
        } else {
            System.out.printf("Pasta %s está vazia%n", pasta1.getName());
        }
    }
}
