package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class _4_ObtendoInformacoesDeArquivosEDiretorios {

    public static void main(String[] args) throws IOException {

        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO\\docs1");
        File arquivo1 = new File(pasta1, "contrato1.txt");

        System.out.printf("\n1. Nome do arquivo: %s%n", arquivo1.getName());
        System.out.printf("2. Diretório pai onde está o arquivo: %s%n", arquivo1.getParent());
        System.out.printf("3. Diretório Canônico pai onde está o arquivo: %s%n", arquivo1.getCanonicalFile());

        System.out.println("\n4. É um arquivo: " + arquivo1.isFile());
        System.out.println("5. É um diretório: " + arquivo1.isDirectory());
        System.out.println("6. Arquivo existe: " + arquivo1.exists());
        System.out.println("7. Esse arquivo é oculto: " + arquivo1.isHidden());

        System.out.println("\n8.Última modificação do arquivo: " + arquivo1.lastModified());
        System.out.println("9.Última modificação do arquivo convertendo para instant: " + Instant.ofEpochMilli(arquivo1.lastModified()));

        System.out.println("\n10. Tamanho do arquivo (em bytes): " + arquivo1.length());

        System.out.println("\n11. Pode executar esse arquivo: " + arquivo1.canExecute());
        System.out.println("12. Pode ler esse arquivo: " + arquivo1.canRead());
        System.out.println("13. Pode escrever esse arquivo: " + arquivo1.canWrite());


    }
}
