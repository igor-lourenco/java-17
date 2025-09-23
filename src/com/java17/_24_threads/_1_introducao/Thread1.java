package com.java17._24_threads._1_introducao;

public class Thread1 extends Thread {

    private final char c;

    public Thread1(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++){
            System.out.print(c);
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
