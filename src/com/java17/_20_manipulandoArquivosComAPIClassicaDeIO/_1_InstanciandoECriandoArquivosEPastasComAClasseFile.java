package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.File;
import java.io.IOException;

public class _1_InstanciandoECriandoArquivosEPastasComAClasseFile {

    public static void main(String[] args) throws IOException {

        String caminhoAbsolutoDaPasta = "C:\\temp\\especialista-java\\java-17\\src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO";


        System.out.println("\nCriando pastas: ");
        File novaPasta1 = new File(caminhoAbsolutoDaPasta + "\\docs");
        boolean criarPasta = novaPasta1.mkdir();
        System.out.println("\n1. Pasta \\docs foi criada: " + criarPasta);

        File novaPasta2 = new File(caminhoAbsolutoDaPasta + "\\fotos\\viagens");
        boolean criarPastasESubPastas = novaPasta2.mkdirs();
        System.out.println("2. Pastas \\fotos e subpasta \\viagens foi criada: " + criarPastasESubPastas);

        System.out.println("=========================================================================");
        System.out.println("Criando arquivos: ");

        File pasta1 = new File(caminhoAbsolutoDaPasta + "\\docs1");
        System.out.println("\n1. Criando pasta \\docs1: " + pasta1.mkdir());
        File arquivo1 = new File(caminhoAbsolutoDaPasta + "\\docs1\\contrato1.txt");


        File pasta2 = new File(caminhoAbsolutoDaPasta + "\\docs2");
        System.out.println("2. Criando pasta \\docs2: " + pasta2.mkdir());
        File arquivo2 = new File(caminhoAbsolutoDaPasta, "docs2\\contrato2.txt");

        File pasta3 = new File(caminhoAbsolutoDaPasta + "\\docs3");
        System.out.println("3. Criando pasta \\docs3: " + pasta3.mkdir());
        File arquivo3 = new File(pasta3, "contrato3.txt");


        System.out.println("\n1. Arquivo contrato1.txt foi criado: " + arquivo1.createNewFile());
        System.out.println("2. Arquivo contrato2.txt foi criado: " + arquivo2.createNewFile());
        System.out.println("3. Arquivo contrato3.txt foi criado: " + arquivo3.createNewFile());





    }
}
