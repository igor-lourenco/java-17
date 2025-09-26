package com.java17._25_concorrencia._6_ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class RemoveFromQueue implements Runnable{

    private final BlockingQueue<String> queue;

    public RemoveFromQueue(BlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        System.out.printf("%s indo dormir por 2s... %n", Thread.currentThread().getName());

        try {
            TimeUnit.SECONDS.sleep(2);

            System.out.printf("%s removendo valor da fila %s%n",
                Thread.currentThread().getName(),
                queue.take());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
