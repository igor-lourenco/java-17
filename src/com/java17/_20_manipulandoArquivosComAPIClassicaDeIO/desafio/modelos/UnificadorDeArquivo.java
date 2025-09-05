package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UnificadorDeArquivo {

    private File pastaOrigem;
    private File arquivoDestino;
    private String prefixoArquivosFragmentados;

    public UnificadorDeArquivo(File pastaOrigem, File arquivoDestino, String prefixoArquivosFragmentados) {
        this.pastaOrigem = pastaOrigem;
        this.arquivoDestino = arquivoDestino;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }


    public void unificar() throws IOException {
        System.out.println("\nFiltrando todos os diretórios e arquivos que estão na pasta: \\" + pastaOrigem.getName());

        File[] filesFiltrados = pastaOrigem.listFiles((diretorio, arquivo) -> arquivo.startsWith(prefixoArquivosFragmentados));

        if (filesFiltrados == null) throw new IOException(String.format(
            "Pasta vazia: \\%s, ou não foi encontrado o arquivo com o prefixo especificado: %s%n", pastaOrigem.getName(), prefixoArquivosFragmentados));

        long tamanho = Arrays.stream(filesFiltrados)
            .filter(UnificadorDeArquivo::fileNaoNullOuNaoTermina)
            .mapToLong(file -> file.length())
            .reduce(0, Long::sum);

        System.out.println("Tamanho do array de bytes: " + tamanho);

        List<File> files = Arrays.stream(filesFiltrados)
            .sorted(Comparator.comparing(File::lastModified))
            .filter(UnificadorDeArquivo::fileNaoNullOuNaoTermina)
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Litando arquivos:");
        files.forEach(f -> System.out.println(f.getName()));

        try (OutputStream outputStream = new FileOutputStream(arquivoDestino)) {
            byte[] bytesLidoArray = new byte[(int) tamanho];
            int quantidadeBytesLido;

            for (File file : files) {
                try (InputStream inputStream = new FileInputStream(file)) {
                    while ((quantidadeBytesLido = inputStream.read(bytesLidoArray)) > 0) {
                        outputStream.write(bytesLidoArray, 0, quantidadeBytesLido); //escrevendo os bytes no arquivo
                    }
                } catch (IOException e) {
                    throw new IOException("Erro de I/O: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            throw new IOException("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException("Erro de I/O: " + e.getMessage());
        }
    }

    private static boolean fileNaoNullOuNaoTermina(File file) {
        return !(file == null || file.getName().endsWith("unificada.jpg"));
    }
}
