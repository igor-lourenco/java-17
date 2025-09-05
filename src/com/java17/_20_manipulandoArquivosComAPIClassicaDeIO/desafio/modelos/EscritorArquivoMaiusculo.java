package com.java17._20_manipulandoArquivosComAPIClassicaDeIO.desafio.modelos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EscritorArquivoMaiusculo {

    private File fileOrigem;
    private File filedestino;


    public EscritorArquivoMaiusculo(File fileOrigem, File filedestino) {
        this.fileOrigem = fileOrigem;
        this.filedestino = filedestino;
    }


    public void processar() throws IOException {

        try (BufferedReader leitor = new BufferedReader(new FileReader(fileOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(filedestino))) {

            List<String> linhas = new ArrayList<>();
            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
                linhas.add(linha);
            }

            for (String s : linhas) {
                escritor.write(s.toUpperCase() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
