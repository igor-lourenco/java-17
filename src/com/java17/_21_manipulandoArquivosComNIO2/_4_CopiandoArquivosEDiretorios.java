package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class _4_CopiandoArquivosEDiretorios {

    public static void main(String[] args) throws IOException {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaFornecedores = pastaBase.resolve(Path.of("docs1\\contratos\\fornecedores"));
        Path pastaCliente = pastaBase.resolve(Path.of("docs1\\contratos\\clientes"));

        Path arquivo = Path.of("contrato-fornecedores.txt");

        if (!Files.exists(pastaFornecedores))
            System.out.printf("1. Criando pasta %s: %s%n", pastaFornecedores, Files.createDirectories(pastaFornecedores));

        if (!Files.exists(pastaCliente))
            System.out.printf("2. Criando pasta %s: %s%n", pastaCliente, Files.createDirectory(pastaCliente));

        Path contratoVendaOrigem = pastaFornecedores.resolve(arquivo);

        if (!Files.exists(contratoVendaOrigem))
            System.out.printf("5. Criando arquivo \\%s: %s%n", arquivo, Files.createFile(contratoVendaOrigem));

        Path pastaClienteDestino = pastaCliente.resolve(arquivo);

        if (!Files.exists(pastaClienteDestino))
            System.out.printf("\n1. Copiando arquivo:%n%s%npara:%n%s:%n%s%n",
                contratoVendaOrigem, pastaClienteDestino, Files.copy(contratoVendaOrigem, pastaClienteDestino));


        System.out.printf("%n2. Copiando e substituindo arquivo \\%s no destino caso exista: %s%n", arquivo,
            Files.copy(contratoVendaOrigem, pastaClienteDestino, StandardCopyOption.REPLACE_EXISTING));

        Path pastaParceiros = pastaBase.resolve(Path.of("docs1\\contratos\\parceiros"));
        System.out.println("3. Obs: o método Files.copy não copia o conteúdo dentro de uma pasta para outra" + Files.copy(pastaFornecedores, pastaParceiros));

    }
}
