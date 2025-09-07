package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _3_OperacoesBasicasComAClasseFiles {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaDocs = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2\\docs1");

        System.out.println("1. Caminho absoluto: " + pastaDocs.toAbsolutePath());
        System.out.println("2. Criando pasta: " + Files.createDirectory(pastaDocs));

        Path pastaFornecedores = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2\\docs1\\contratos\\fornecedores");
        System.out.println("3. Criando pasta e subpastas caso não exista: " + Files.createDirectories(pastaFornecedores));

        Path arquivo = Path.of("contrato-fornecedores.txt");
        Path contratoVenda = pastaFornecedores.resolve(arquivo);
        System.out.printf("%n4 .Verifica se o arquivo \\%s existe na pasta \\%s: %b%n", arquivo, contratoVenda.getParent(), Files.exists(contratoVenda));
        System.out.printf("5. Criando arquivo \\%s: %s%n", arquivo, Files.createFile(contratoVenda));
        System.out.printf("6. Verificando novamente se o arquivo \\%s existe na pasta \\%s: %b%n", arquivo, contratoVenda.getParent(), Files.exists(contratoVenda));

    }
}
