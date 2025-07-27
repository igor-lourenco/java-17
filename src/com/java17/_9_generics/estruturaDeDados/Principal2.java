package com.java17._9_generics.estruturaDeDados;

import java.util.ArrayList;

public class Principal2 {

    public static void main(String[] args) {

        ArrayList<Double> numeros1 = new ArrayList<>();
        numeros1.add(20d);
        numeros1.add(10d);
        numeros1.add(21d);

        System.out.println(calcularMedia(numeros1));

        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(20);
        numeros2.add(10);
        numeros2.add(21);

        System.out.println(calcularMedia(numeros2));
    }


    public static double calcularMedia(ArrayList<? extends Number> numeros) {
        double total = 0;

        for(Number numero : numeros){
            total = total + numero.doubleValue();
        }

        return total / numeros.size();
    }
}
