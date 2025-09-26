package com.java17._25_concorrencia._6_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
/*      Implementação de fila bloqueante, baseada em array de tamanho fixo.

        * Capacidade fixa:
            - Define o tamanho no construtor, e ele não cresce mais.

        * Thread-safe:
            - Usa locks e condições internamente para garantir segurança em ambientes multi-thread.
            - Permite múltiplas threads produtoras e consumidoras simultaneamente.

        * Operações bloqueantes, Se a fila estiver cheia a thread que tentar inserir pode:
            - Esperar até liberar espaço (put)
            - Falhar imediatamente (offer)

        * Se a fila estiver vazia, a thread que tentar remover pode:
            - Esperar até aparecer um item (take)
            - Falhar imediatamente (poll)

        * Ordem FIFO (First-In-First-Out)
            - Primeiro elemento inserido é o primeiro a ser removido, como uma fila normal.
*/
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        queue.put("João");
        System.out.printf("%s adicionou o valor %s%n", Thread.currentThread().getName(), queue.peek());

        System.out.println("Tentando adicionar outro valor...");


        new Thread(new RemoveFromQueue(queue)).start();

        queue.put("Maria");
        System.out.printf("%s adicionado o valor %s%n", Thread.currentThread().getName(), queue.peek());
    }
}
