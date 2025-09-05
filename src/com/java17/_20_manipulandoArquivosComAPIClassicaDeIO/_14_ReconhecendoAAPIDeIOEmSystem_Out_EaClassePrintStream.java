package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _14_ReconhecendoAAPIDeIOEmSystem_Out_EaClassePrintStream {

    public static void main(String[] args) throws IOException {

        String nome = "João";

        OutputStream out = System.out;
        out.write(String.format("Olá, %s%n", nome).getBytes());

        PrintStream printStream = new PrintStream(out);
        printStream.printf("Olá, %s%n", nome);

        File pasta = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo = new File(pasta, "docs1\\PrintOutputStream.txt");
        PrintStream print = new PrintStream(new FileOutputStream(arquivo));

        System.out.println("Escrevendo no arquivo...");

        print.printf("Olá, %s%n", nome);

        System.out.println("Fim :-)");
    }
}
