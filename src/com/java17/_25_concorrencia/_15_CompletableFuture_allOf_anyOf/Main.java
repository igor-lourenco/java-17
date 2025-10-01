package com.java17._25_concorrencia._15_CompletableFuture_allOf_anyOf;

import com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas.LojaService;
import com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas.Orcamento;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        LojaService lojaService = new LojaService();

        System.out.println("\n1. Executando método de forma assíncrona: ");
        pesquisaPrecosComDescontoAsync(lojaService);
    }


    private static void pesquisaPrecosComDescontoAsync(LojaService service) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        CompletableFuture[] completableFutures = lojas.stream()
            .map(loja -> CompletableFuture.supplyAsync(() -> service.getPrecoSync(loja)))
            .map(completableFuture -> completableFuture.thenApply(Orcamento::novoOrcamento))
            .map(completableFuture -> completableFuture.thenCompose(orc -> CompletableFuture.supplyAsync(() -> service.aplicaDesconto(orc))))
            .map(completableFuture -> completableFuture.thenAccept(s -> System.out.printf("%s finalizado em %d%n", s, System.currentTimeMillis() - start)))
            .toArray(CompletableFuture[]::new);

//        allOf -> Retorna um novo CompletableFuture que é concluído quando todos os CompletableFutures fornecidos são concluídos
//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
//        voidCompletableFuture.join();
//        System.out.printf("[%s] Finalizado? %b%n", Thread.currentThread().getName(), voidCompletableFuture.isDone());


//      anyOf -> Retorna um novo CompletableFuture que é concluído quando qualquer um dos CompletableFutures fornecidos é concluído, com o mesmo resultado.
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("[%s] Finalizado? %b%n", Thread.currentThread().getName(), voidCompletableFuture.isDone());


        long end = System.currentTimeMillis();
        System.out.printf("Tempo: %dms%n", (end - start));
    }
}
