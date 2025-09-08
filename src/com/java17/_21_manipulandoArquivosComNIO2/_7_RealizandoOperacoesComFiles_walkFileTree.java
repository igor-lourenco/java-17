package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class _7_RealizandoOperacoesComFiles_walkFileTree {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs2 = pastaBase.resolve(Path.of("docs2"));

        criandoPastasEArquivos(pastaDocs2);

        System.out.println("===== Caminhando por uma árvore de arquivos =====");
        Files.walkFileTree(pastaDocs2, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("\nDiretório: " + dir);

//            return FileVisitResult.CONTINUE;
                return super.preVisitDirectory(dir, attrs);
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Arquivo: " + file);
                System.out.printf("Excluindo \\%s: %b%n", file, Files.deleteIfExists(file));

//            return FileVisitResult.CONTINUE;
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Excluindo diretório \\%s: %b%n", dir, Files.deleteIfExists(dir));

//            return FileVisitResult.CONTINUE;
                return super.postVisitDirectory(dir, exc);
            }
        });


    }

    private static void criandoPastasEArquivos(Path pastaDocs2) throws IOException {
        System.out.println("\n ===== Criando Pastas e arquivos =====");

        Path pastaContratos = pastaDocs2.resolve(Path.of("contratos"));

        Path pastaFornecedores = pastaContratos.resolve(Path.of("fornecedores"));
        Path pastaCliente = pastaContratos.resolve(Path.of("clientes"));

        Path arquivo01 = Path.of("contrato01.txt");
        Path arquivo02 = Path.of("contrato02.txt");
        Path arquivo03 = Path.of("contrato03.txt");
        Path arquivo04 = Path.of("contrato04.txt");
        Path arquivo05 = Path.of("contrato05.txt");
        Path arquivo06 = Path.of("contrato06.txt");

        Path pastaContratosComArquivo01 = pastaContratos.resolve(arquivo01);
        Path pastaFornecedoresComArquivo02 = pastaFornecedores.resolve(arquivo02);
        Path pastaFornecedoresComArquivo03 = pastaFornecedores.resolve(arquivo03);
        Path pastaClientesComArquivo04 = pastaCliente.resolve(arquivo04);
        Path pastaClientesComArquivo05 = pastaCliente.resolve(arquivo05);
        Path pastaDocsComArquivo06 = pastaDocs2.resolve(arquivo06);


        System.out.println("1. Criando pasta: " + Files.createDirectory(pastaDocs2));
        System.out.println("2. Criando pasta: " + Files.createDirectory(pastaContratos));
        System.out.println("3. Criando pasta: " + Files.createDirectory(pastaFornecedores));
        System.out.println("4. Criando pasta: " + Files.createDirectory(pastaCliente));

        System.out.println("\n1. Criando arquivo: " + Files.createFile(pastaContratosComArquivo01));
        System.out.println("2. Criando arquivo: " + Files.createFile(pastaFornecedoresComArquivo02));
        System.out.println("3. Criando arquivo: " + Files.createFile(pastaFornecedoresComArquivo03));
        System.out.println("4. Criando arquivo: " + Files.createFile(pastaClientesComArquivo04));
        System.out.println("5. Criando arquivo: " + Files.createFile(pastaClientesComArquivo05));
        System.out.println("6. Criando arquivo: " + Files.createFile(pastaDocsComArquivo06));

        System.out.println("\n ===== Pastas e arquivos criados =====");
    }
}
