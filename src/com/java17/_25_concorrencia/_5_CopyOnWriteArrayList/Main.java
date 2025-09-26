package com.java17._25_concorrencia._5_CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
/*      Toda vez que altera a lista (add, set, remove, etc.), ela cria uma cópia do array interno.

        * Thread-safety sem necessidade de sincronização manual
            - Como cada alteração cria um novo array, leitores nunca veem inconsistências, mesmo em ambiente multi-thread.

        * Iteradores não lançam ConcurrentModificationException
            - Diferente de ArrayList e HashMap, pode iterar sobre a lista mesmo enquanto outras threads estão modificando.
            - Acontece porque o iterador enxerga uma snapshot (cópia) do array no momento em que foi criado.
*/
        List<Integer> lista = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 1000; i++) {
            lista.add(i);
        }


        Runnable runIterator = () -> {
            System.out.println("SIZE ITERATOR ANTES DE PERCORRER: " + lista.size());
            Iterator<Integer> iterator = lista.iterator();

            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(i -> System.out.print(i + ", "));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nSIZE ITERATOR DEPOIS DE PERCORRER: " + lista.size());
        };

        Runnable runRemove = () -> {
            System.out.println("SIZE ANTES DE REMOVER: " + lista.size());
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
                lista.remove(i);
            }
            System.out.println("SIZE DEPOIS DE REMOVER: " + lista.size());
        };

        new Thread(runIterator).start();
        new Thread(runIterator).start();
        new Thread(runRemove).start();

    }
}
