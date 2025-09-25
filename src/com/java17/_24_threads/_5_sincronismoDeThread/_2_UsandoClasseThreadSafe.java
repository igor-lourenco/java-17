package com.java17._24_threads._5_sincronismoDeThread;

import java.util.ArrayList;
import java.util.List;

public class _2_UsandoClasseThreadSafe {

    public static void main(String[] args) {

        ClasseThreadSafe threadSafe = new ClasseThreadSafe();

        threadSafe.add("João");

        new Thread(threadSafe::removeFirst).start();
        new Thread(threadSafe::removeFirst).start();

    }

    static class ClasseThreadSafe {

        private final List<String> nomes = new ArrayList<>();

        public synchronized boolean add(String nome) {
            return this.nomes.add(nome);
        }

        public synchronized void removeFirst() {
            if (!this.nomes.isEmpty()) {
                System.out.println(Thread.currentThread().getName());
                System.out.println(this.nomes.remove(0));
            }
        }
    }
}
