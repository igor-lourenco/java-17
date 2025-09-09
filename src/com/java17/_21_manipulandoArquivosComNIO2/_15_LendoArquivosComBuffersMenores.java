package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _15_LendoArquivosComBuffersMenores {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo.txt"));

        ByteBuffer buffer = ByteBuffer.allocate(10); // 1KB
        StringBuilder sb = new StringBuilder();


        try (ByteChannel channel = Files.newByteChannel(arquivo, StandardOpenOption.READ)) {

            System.out.println("1. Limite do buffer: " + buffer.limit());
            System.out.println("2. Posição atual do array: " + buffer.position());

            System.out.println("\n3. Lendo arquivo e adicionando no buffer");
            while (channel.read(buffer) > 0) {
                System.out.println("=========================================================");

                System.out.println("\n4. Limite do buffer: " + buffer.limit());
                System.out.println("5. Posição atual do array: " + buffer.position());

                System.out.println("\n6. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro");
                buffer.flip();

                System.out.println("\n7. Limite do buffer: " + buffer.limit());
                System.out.println("8. Posição atual do array: " + buffer.position());


                System.out.println("\n9. Atribuindo o ByteBuffer para CharBuffer");
                Charset utf8 = StandardCharsets.UTF_8;
                CharBuffer charBuffer = utf8.decode(buffer);
                sb.append(charBuffer.toString());

                System.out.println("10. Zerando o buffer e voltando o ponteiro para a posição zero ...");
                buffer.clear();
            }

            System.out.println("\n11. Conteúdo lido do arquivo: " + sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
