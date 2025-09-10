package com.java17._21_manipulandoArquivosComNIO2.desafio.modelos;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FragmentadorDeArquivo {

    private Path arquivo;
    private int tamanhoFragmento;

    public FragmentadorDeArquivo(Path arquivo, int tamanhoFragmento) {
        this.arquivo = arquivo;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    public void fragmentar() throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(tamanhoFragmento);

        try (ByteChannel channel = Files.newByteChannel(arquivo, StandardOpenOption.READ)) {

            int i = 1;

            while (channel.read(buffer) > 0) {
                System.out.println("\n1. Limite do buffer: " + buffer.limit());
                System.out.println("2. Posição atual do array: " + buffer.position());

                System.out.println("3. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro");
                buffer.flip();

                System.out.println("4. Limite do buffer: " + buffer.limit());
                System.out.println("5. Posição atual do array: " + buffer.position());

                String[] nomeArquivo = arquivo.getFileName().toString().split("\\.");
                Path imagem = Path.of(nomeArquivo[0] + "-" + i + "." + nomeArquivo[1]);

                salvandoImagemFragmentada(arquivo.getParent().resolve(imagem), buffer);
                System.out.println("6. Arquivo salvo: " + imagem);

                buffer.clear();
                i++;
            }
        }
    }

    private void salvandoImagemFragmentada(Path imagem, ByteBuffer buffer) throws IOException {

        try (ByteChannel channel = Files.newByteChannel(imagem
            , StandardOpenOption.WRITE
            , StandardOpenOption.CREATE
            , StandardOpenOption.TRUNCATE_EXISTING)) {

            channel.write(buffer);

        } catch (IOException e) {
            System.out.printf("Erro ao salvar imagem: %s - ERROR: %s%n", imagem, e.getMessage());
            throw new IOException("Erro de I/O: " + e.getMessage());
        }
    }
}
