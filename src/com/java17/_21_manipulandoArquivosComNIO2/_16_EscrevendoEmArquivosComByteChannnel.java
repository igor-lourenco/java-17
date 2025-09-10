package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _16_EscrevendoEmArquivosComByteChannnel {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo1.txt"));

        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

        buffer.flip();
        CharBuffer decode = StandardCharsets.UTF_8.decode(buffer);
        System.out.println("Conteúdo do buffer: " + decode);

        try (ByteChannel channel = Files.newByteChannel(arquivo
            , StandardOpenOption.WRITE // Escrita
            , StandardOpenOption.CREATE // Cria arquivo se não existir
           , StandardOpenOption.TRUNCATE_EXISTING // Se o arquivo existir e for aberto para escrita, ele apaga o que está no arquivo
        )) {

            System.out.println("\n1. Limite do buffer: " + buffer.limit());
            System.out.println("2. Posição atual do array: " + buffer.position());

            System.out.println("\n3. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro");
            buffer.flip();

            System.out.println("\n4. Limite do buffer: " + buffer.limit());
            System.out.println("5. Posição atual do array: " + buffer.position());

            System.out.println("\n6.Escrevendo no arquivo ...");
            channel.write(buffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
