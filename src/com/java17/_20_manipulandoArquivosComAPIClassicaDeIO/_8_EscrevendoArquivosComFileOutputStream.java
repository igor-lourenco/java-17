package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;

public class _8_EscrevendoArquivosComFileOutputStream {

    public static void main(String[] args) {
        System.out.println();
        File pasta1 = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo1 = new File(pasta1, "fotos\\viagens\\imagem.jpg");
        File arquivo2 = new File(pasta1, "fotos\\viagens\\imagem-copia.jpg");


        try (InputStream inputStream = new FileInputStream(arquivo1);
             OutputStream outputStream = new FileOutputStream(arquivo2)) {

            byte[] bytesLidoArray = new byte[1024 * 100]; // 100 KB
            int quantidadeBytesLido;

            while ((quantidadeBytesLido = inputStream.read(bytesLidoArray)) > 0 ) {
                System.out.println("Quantidade de bytes lido: " + quantidadeBytesLido);

                //escrevendo os bytes no arquivo
                outputStream.write(bytesLidoArray, 0, quantidadeBytesLido);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
