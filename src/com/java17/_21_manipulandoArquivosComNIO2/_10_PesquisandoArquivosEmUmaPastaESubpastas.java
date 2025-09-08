package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class _10_PesquisandoArquivosEmUmaPastaESubpastas {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));


        Integer profundidadeMaxima = Integer.MAX_VALUE;
        BiPredicate<Path, BasicFileAttributes> matcher =  (path, attrs) ->
            path.getFileName().toString().matches(".*\\.txt"); // apenas arquivos de terminam com .txt


        try(var stream = Files.find(pastaDocs1, profundidadeMaxima, matcher)) {

            System.out.println("Pesquisando arquivos .txt na pasta e subpastas:");
            stream.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
