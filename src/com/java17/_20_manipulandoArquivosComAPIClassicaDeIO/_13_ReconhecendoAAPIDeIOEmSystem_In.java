package com.java17._20_manipulandoArquivosComAPIClassicaDeIO;

import java.io.*;
import java.util.Scanner;

public class _13_ReconhecendoAAPIDeIOEmSystem_In {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String linha;
        System.out.println("\nUsando o Scanner:");
        do {
            System.out.print("Digite: ");
            linha = scanner.nextLine();
            System.out.println("Você digitou: " + linha);
        } while (!linha.equals("sair"));
        System.out.println("Saindo :)");


        System.out.println("=================================");
        System.out.println("Usando o BufferedReader:");

        InputStream inputStream = System.in;
        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));

        String linha2;

        do {
            System.out.print("Digite: ");
            linha2 = leitor.readLine();
            System.out.println("Você digitou: " + linha2);
        } while (!linha2.equals("sair"));
        System.out.println("Saindo :)");


        System.out.println("=================================tet");
        System.out.println("Lendo arquivo docs1\\linha.txt com Scanner:");

        File pasta = new File("src\\com\\java17\\_20_manipulandoArquivosComAPIClassicaDeIO");
        File arquivo = new File(pasta, "docs1\\lista.txt");
        Scanner scanner1 = new Scanner(new FileInputStream(arquivo));

        int i = 1;
        while (scanner1.hasNextLine()){
            System.out.printf("Linha %d: %s%n", i, scanner1.nextLine());
            i++;
        }
    }
}
