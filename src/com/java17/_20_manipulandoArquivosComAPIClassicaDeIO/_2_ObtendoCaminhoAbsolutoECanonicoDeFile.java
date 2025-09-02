package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.File;
import java.io.IOException;

public class _2_ObtendoCaminhoAbsolutoECanonicoDeFile {

    public static void main(String[] args) throws IOException {

        String caminhoAbsolutoDaPasta = "C:\\temp\\especialista-java\\java-17";
        File arquivo1 = new File(caminhoAbsolutoDaPasta, "docs\\contrato1.txt");

        System.out.println("\n1. Caminho Absoluto: " + arquivo1);

        String caminhoRelativo2 = "docs\\contrato2.txt";
        File arquivo2 = new File(caminhoRelativo2).getAbsoluteFile();

        System.out.println("\n1. Caminho Relativo: " + caminhoRelativo2);
        System.out.println("2. Caminho Absoluto com caminho relativo resolvido: " + arquivo2);


        String caminhoRelativo3 = "..\\docs\\contrato3.txt";
        File arquivo3 = new File(caminhoRelativo3);

        System.out.println("\n1. Caminho Relativo: " + caminhoRelativo3);
        System.out.println("2. Caminho Absoluto (não resolvido): " + arquivo3.getAbsoluteFile());
        System.out.println("2. Caminho Canônico (caminho absoluto resolvido): " + arquivo3.getAbsoluteFile().getCanonicalFile());
    }
}
