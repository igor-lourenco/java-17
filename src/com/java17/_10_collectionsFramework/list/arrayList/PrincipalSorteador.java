package com.java17._10_collectionsFramework.list.arrayList;

import com.java17._10_collectionsFramework.list.arrayList.megasena.Sorteador;

public class PrincipalSorteador {

    public static void main(String[] args) {

        Sorteador sorteador = new Sorteador();

//        Iterator<Integer> sortear = sorteador.iterator();
//
//        while (sortear.hasNext()) {
//            System.out.println("Numero: " + sortear.next());
//        }

//        System.out.println("Numero: " + sortear.next());

        for (Integer i : sorteador) {
            System.out.println("Numero: " + i);

        }

    }


}
