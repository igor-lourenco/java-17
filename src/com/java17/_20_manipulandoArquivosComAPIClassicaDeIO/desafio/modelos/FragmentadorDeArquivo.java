package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos;

import java.io.*;

public class FragmentadorDeArquivo {

    private File pathName;
    private int tamanhoFragmento;
    private String formatoArquivo;

    public FragmentadorDeArquivo(File pathName, String formatoArquivo, int tamanhoFragmento) {
        this.pathName = pathName;
        this.tamanhoFragmento = tamanhoFragmento;
        this.formatoArquivo = formatoArquivo;
    }

    public void fragmentar() throws IOException {

        try (InputStream inputStream = new FileInputStream(pathName + formatoArquivo)) {

            byte[] bytesLidoArray = new byte[tamanhoFragmento];
            int quantidadeBytesLido;

            int i = 1;
            while ((quantidadeBytesLido = inputStream.read(bytesLidoArray)) > 0) {
                System.out.println("Quantidade de bytes lido: " + quantidadeBytesLido);
                OutputStream outputStream = new FileOutputStream(pathName + "-" + i + formatoArquivo);

                //escrevendo os bytes no arquivo
                outputStream.write(bytesLidoArray, 0, quantidadeBytesLido);
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException("Erro de I/O: " + e.getMessage());
        }
    }
}
