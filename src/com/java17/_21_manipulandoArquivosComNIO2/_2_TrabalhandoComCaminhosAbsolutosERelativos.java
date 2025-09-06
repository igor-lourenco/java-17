package com.java17._21_manipulandoArquivosComNIO2;

import java.nio.file.Path;

public class _2_TrabalhandoComCaminhosAbsolutosERelativos {

    public static void main(String[] args) {
        System.out.println();

        Path caminhoRelativo1 = Path.of("docs\\contrato.txt");
        Path caminhoAbsoluto1 = caminhoRelativo1.toAbsolutePath();

        System.out.println("1. Caminho relativo: " + caminhoRelativo1);
        System.out.println("2. caminho absoluto: " + caminhoAbsoluto1);
        System.out.println("3. Verifica se o caminho é absoluto: " + caminhoAbsoluto1.isAbsolute());
        System.out.println("3. Verifica se o caminho é relativo: " + !caminhoRelativo1.isAbsolute());

        System.out.println("=================================================\n");

        Path caminhoRelativo2 = Path.of("../docs\\contrato.txt");
        Path caminhoAbsoluto2 = caminhoRelativo2.toAbsolutePath();

        System.out.println("1. Caminho relativo: " + caminhoRelativo2);
        System.out.println("2. Caminho absoluto: " + caminhoAbsoluto2);
        System.out.println("3. Normalizando o caminho absoluto: " + caminhoAbsoluto2.normalize());

        System.out.println("=================================================\n");

        Path pasta = Path.of("docs");
        Path arquivo = Path.of("contrato.txt");

        Path arquivoResolvido = pasta.resolve(arquivo);
        System.out.println("1. Resolvendo arquivo: " + arquivoResolvido);
        System.out.println("2. Caminho absoluto do arquivo resolvido: " + arquivoResolvido.toAbsolutePath());

    }
}
