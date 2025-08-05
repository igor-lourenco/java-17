package com.java17._10_collectionsFramework;

import java.util.Arrays;
import java.util.List;

public class PrincipalColecoesComArrays {

    public static void main(String[] args) {


        Integer[] numeros1 = new Integer[] {1, 2};

        List<Integer> lista = Arrays.asList(numeros1);

//      As alterações feitas no array também é refletida na lista
        numeros1[1] = 3;

        System.out.println(Arrays.toString(numeros1));
        System.out.println(lista);

//      As alterações feitas na lista também é refletida no array
        lista.set(0,5);

        System.out.println(Arrays.toString(numeros1));
        System.out.println(lista);

//        Solta exceção porque não tem como adicionar novos elementos em um array porque o tamanho não é redimensionável
//        lista.add(2, 5);
    }
}
