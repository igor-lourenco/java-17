package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _9_ListandoConteudoDeDiretorios {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        try (var stream = Files.list(pastaDocs1)) {
            stream
                .forEach(s -> {
                    String arquivoOuDiretorio = Files.isDirectory(s) ? "Diretório" : "Arquivo";
                    System.out.println(arquivoOuDiretorio + ": " + s.getFileName());
                });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
