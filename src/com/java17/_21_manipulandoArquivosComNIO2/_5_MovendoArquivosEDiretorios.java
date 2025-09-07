package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _5_MovendoArquivosEDiretorios {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaFornecedores = pastaBase.resolve(Path.of("docs1\\contratos\\fornecedores"));
        Path pastaCliente = pastaBase.resolve(Path.of("docs1\\contratos\\clientes"));

        if(!Files.exists(pastaFornecedores)) Files.createDirectories(pastaFornecedores);
        if(!Files.exists(pastaCliente)) Files.createDirectories(pastaCliente);

        Path arquivo = Path.of("contrato-fornecedores2.txt");

        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivo);
        Path arquivoContratoDestino = pastaCliente.resolve(arquivo);

        if (!Files.exists(arquivoContratoOrigem))
            System.out.println("1. Criando arquivo: " + Files.createFile(arquivoContratoOrigem));

        if (!Files.exists(arquivoContratoDestino))
        Files.move(arquivoContratoOrigem, arquivoContratoDestino);


        System.out.println("======================================");

        Path pastaVendas = pastaBase.resolve(Path.of("docs1\\vendas"));

        System.out.println("Renomeando e movendo pasta docs1\\contratos\\clientes para docs1\\vendas:");
        System.out.println(Files.move(pastaCliente, pastaVendas)); // também serve para renomear pasta
    }
}
