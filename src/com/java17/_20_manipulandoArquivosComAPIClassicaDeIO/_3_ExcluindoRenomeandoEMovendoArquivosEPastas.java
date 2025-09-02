package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.File;

public class _3_ExcluindoRenomeandoEMovendoArquivosEPastas {

    public static void main(String[] args) {

        String pastaDoProjeto = "src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";

        String arquivo1 = "docs4";
        File pasta1 = new File(pastaDoProjeto, arquivo1);
        File caminhoAbsoluto1 = pasta1.getAbsoluteFile();

        System.out.println("\n1. Pasta1: " + pasta1);
        System.out.printf("2. Caminho absoluto pasta1: %s%n", caminhoAbsoluto1);
        System.out.printf("3. Criando pasta1 \\%s: %b%n", arquivo1, caminhoAbsoluto1.mkdir());

        String arquivo2 = "documentos1";
        File pasta2 = new File(pastaDoProjeto , arquivo2);
        File caminhoAbsoluto2 = pasta2.getAbsoluteFile();

        System.out.println("\n1. Pasta2: " + pasta2);
        System.out.println("2. Caminho absoluto pasta2: " + caminhoAbsoluto2);

        boolean foiRenomeado = pasta1.renameTo(pasta2);
        System.out.printf("3. Renomeando pasta1 '\\%s' para pasta2 '\\%s': %b%n", caminhoAbsoluto1.getName(), caminhoAbsoluto2.getName(), foiRenomeado);

        System.out.println("\nObservação: o método renameTo também serve para mover arquivos e pastas");

        System.out.println("============================================================\n");

        String nomeArquivo = "contrato.txt";
        File arquivo = new File(caminhoAbsoluto2, nomeArquivo);

        System.out.println("1. Arquivo: " + nomeArquivo);
        System.out.println("2. Caminho Absoluto: " + arquivo);
        System.out.printf("3. Criando arquivo na pasta %s: %b%n", caminhoAbsoluto2.getName(), arquivo.mkdir());

        System.out.printf("4. Removendo arquivo %s: %b%n", nomeArquivo, arquivo.delete());
        System.out.printf("5. Removendo pasta %s: %b%n", caminhoAbsoluto2.getName(), caminhoAbsoluto2.delete());

    }
}
