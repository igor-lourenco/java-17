package com.java17._12_trabalhandoComStrings;

public class PrincipalStringBuilder {

    public static void main(String[] args) {

        long tempoInicio = System.currentTimeMillis();

//        String text = "";
//
//        for (int i = 0; i < 200_000; i++) {
//            text = text + "#";
//        }
//
//        System.out.println(text);


        StringBuilder builder = new StringBuilder(210_000); // tamanho do array inicial

        for (int i = 0; i < 200_000; i++) {
            builder.append("#");
        }

        System.out.println(builder);

        double duracaoEmSegundos = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duracao: %.2f segundos%n", duracaoEmSegundos);
    }
}
