package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _8_ObtendoInformacoesDeArquivosEDiretorios {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo.txt"));

        System.out.printf("1. Arquivo \\%s existe? %b%n", arquivo.getFileName(), Files.exists(arquivo));
        System.out.printf("2. Tamanho do arquivo \\%s em bytes: %d%n",arquivo.getFileName(), Files.size(arquivo));
        System.out.printf("3. Tamanho do arquivo \\%s em KB: %.3f%n", arquivo.getFileName(), (double) Files.size(arquivo) / 1024);
        System.out.println("4. É um arquivo? " + Files.isRegularFile(arquivo));
        System.out.println("5. É um diretório? " + Files.isDirectory(arquivo));


        System.out.println("\n6. Data da última modificação do arquivo: " + Files.getLastModifiedTime(arquivo));
        System.out.println("7. Convertendo a data da última modificação do arquivo em Instant: " + Files.getLastModifiedTime(arquivo).toInstant());

        System.out.println("\n8. Pode ler? " + Files.isReadable(arquivo));
        System.out.println("9. Pode escrever? " + Files.isWritable(arquivo));
        System.out.println("10. Pode executar? " + Files.isExecutable(arquivo));
    }
}
