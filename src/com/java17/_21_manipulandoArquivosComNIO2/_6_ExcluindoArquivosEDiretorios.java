package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _6_ExcluindoArquivosEDiretorios {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaFornecedores = pastaBase.resolve(Path.of("docs1\\contratos\\fornecedores"));
        Path pastaCliente = pastaBase.resolve(Path.of("docs1\\contratos\\clientes"));

        if(!Files.exists(pastaFornecedores)) Files.createDirectories(pastaFornecedores);
        if(!Files.exists(pastaCliente)) Files.createDirectories(pastaCliente);

        Path arquivo = Path.of("contrato-fornecedores2.txt");

        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivo);

        if (!Files.exists(arquivoContratoOrigem))
            System.out.println("1. Criando arquivo: " + Files.createFile(arquivoContratoOrigem));

        System.out.printf("\n2. Deletando arquivo %s: %s%n", arquivoContratoOrigem, Files.deleteIfExists(arquivoContratoOrigem));

        System.out.printf("2. Deletando pasta %s(se a pasta não estiver vazia solta exception): %s%n", pastaCliente, Files.deleteIfExists(pastaCliente));


    }
}
