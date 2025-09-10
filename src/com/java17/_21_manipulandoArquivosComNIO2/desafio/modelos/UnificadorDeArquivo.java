package com.java17._21_manipulandoArquivosComNIO2.desafio.modelos;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class UnificadorDeArquivo {

    private Path pastaOrigem;
    private Path arquivoDestino;
    private String prefixoArquivosFragmentados;

    public UnificadorDeArquivo(Path pastaOrigem, Path arquivoDestino, String prefixoArquivosFragmentados) {
        this.pastaOrigem = pastaOrigem;
        this.arquivoDestino = arquivoDestino;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        List<Path> paths = Files.list(pastaOrigem)
            .filter(Files::isRegularFile)
            .filter(path -> !(path.getFileName().toString().endsWith("unificada.jpg")))
            .filter(path -> path.getFileName().toString().startsWith(prefixoArquivosFragmentados))
            .sorted(UnificadorDeArquivo::ordenandoArquivosPeloNumeroNoNome)
            .collect(Collectors.toList());

        try (ByteChannel channel = Files.newByteChannel(arquivoDestino
            , StandardOpenOption.WRITE // Escrita
            , StandardOpenOption.CREATE // Cria arquivo se não existir
            , StandardOpenOption.TRUNCATE_EXISTING )) {// Se o arquivo existir e for aberto para escrita, ele apaga o que está no arquivo

            long tamanhoTotal = paths.stream()
                .map(Path::toFile)
                .mapToLong(File::length).sum();

            ByteBuffer buffer = lendoBytesDoArquivoEAdicionandoNoBuffer(paths, tamanhoTotal);

            System.out.println("\n1. Limite do buffer: " + buffer.limit());
            System.out.println("2. Posição atual do array: " + buffer.position());

            System.out.println("\n3. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro");
            buffer.flip();

            System.out.println("\n4. Limite do buffer atualizado: " + buffer.limit());
            System.out.println("5. Posição atual do array atualizado: " + buffer.position());

            System.out.println("4. Gravando os bytes no arquivo: " + arquivoDestino.getFileName());
            channel.write(buffer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ByteBuffer lendoBytesDoArquivoEAdicionandoNoBuffer(List<Path> paths, long tamanhoBuffer) {
        ByteBuffer buffer = ByteBuffer.allocate((int) tamanhoBuffer);

        for (Path path : paths) {
            try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {

                System.out.println("Lendo bytes do arquivo: " + path.getFileName());
                channel.read(buffer);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return buffer;
    }

    private static int ordenandoArquivosPeloNumeroNoNome(Path path1, Path path2) {
        String nomeArquivo1 = path1.getFileName().toString().split("-")[1];
        String nomeArquivo2 = path2.getFileName().toString().split("-")[1];

        int numArquivo1 = Integer.valueOf(nomeArquivo1.split("\\.")[0]);
        int numArquivo2 = Integer.valueOf(nomeArquivo2.split("\\.")[0]);

        return Integer.compare(numArquivo1, numArquivo2);
    }
}
