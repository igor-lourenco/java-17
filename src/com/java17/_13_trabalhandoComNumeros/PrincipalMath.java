package com.java17._13_trabalhandoComNumeros;

public class PrincipalMath {

    public static void main(String[] args) {


//      TODO: método min() para descobrir menor numero
        int x1 = 100;
        int y1 = 101;

        System.out.println();
        System.out.println("Menor numero: " + Math.min(x1, y1));

//      TODO: método max() para descobrir maior numero
        int x2 = 100;
        int y2 = 101;

        System.out.println();
        System.out.println("Maior numero: " + Math.max(x2, y2));


//      TODO: método abs() para descobrir numero absoluto(sem o sinal negativo)
        float x3 = -100.5f;
        float y3 = 105.5f;

        System.out.println();
        System.out.println("Numero absoluto: " + Math.abs(x3));
        System.out.println("Numero absoluto: " + Math.abs(y3));

//      TODO: método ceil() para arredondar numero para cima
        float x4 = -100.1f;
        float y4 = 105.9f;

        System.out.println();
        System.out.printf("Numero arredondado pra cima %.1f: %.1f%n",x4, Math.ceil(x4));
        System.out.printf("Numero arredondado pra cima %.1f: %.1f%n", y4, Math.ceil(y4));

//      TODO: método floor() para arredondar numero para baixo
        float x5 = -100.9f;
        float y5 = 105.9f;

        System.out.println();
        System.out.printf("Numero arredondado pra baixo %.1f: %.1f%n",x5, Math.floor(x5));
        System.out.printf("Numero arredondado pra baixo %.1f: %.1f%n", y5, Math.floor(y5));

//      TODO: método round() para arredondar numero para o mais próximo
        float x6 = 100.4f;
        float y6 = 105.5f;

        System.out.println();
        System.out.printf("Numero arredondado para o mais proximo %.1f: %d%n",x6, Math.round(x6));
        System.out.printf("Numero arredondado para o mais proximo %.1f: %d%n",y6, Math.round(y6));

//      TODO: método sqrt() para raiz quadrada
        float x7 = 16;
        float y7 = 81;

        System.out.println();
        System.out.printf("Raiz quadrada do numero %.2f: %.2f%n",x7, Math.sqrt(x7));
        System.out.printf("Raiz quadrada do numero %.2f: %.2f%n",y7, Math.sqrt(y7));

//      TODO: método pow() para expoente
        float x8 = 16;
        float y8 = 2;

        System.out.println();
        System.out.printf("Base %.2f, expoente %.2f: %.2f%n",x8, y8,Math.pow(x8, y8));




    }
}
