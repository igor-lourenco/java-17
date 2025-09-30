package com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class LojaService {


    public String getPrecoSync(String nomeLoja) {
        System.out.printf(">>> Obtendo preco sync da loja %s%n", nomeLoja);
        double preco = geradorPreco();
        Desconto.Code codigoDesconto = Desconto.Code.values()[ThreadLocalRandom.current().nextInt(Desconto.Code.values().length)];

        return String .format("%s:%.2f:%s",nomeLoja, preco, codigoDesconto);
    }


    public String aplicaDesconto(Orcamento orcamento){
        System.out.printf("[%s] simulando API externa para buscar desconto...%n", Thread.currentThread().getName());

        delay();

        double desconto = orcamento.getPreco() * (100 - orcamento.getCodigoDesconto().getPorcentagemDesconto()) / 100;

        return String.format("'%s' preco original: '%.2f'. Aplicando desconto de: '%s'. Preco final: '%.2f'",
            orcamento.getNomeLoja(), orcamento.getPreco(), orcamento.getCodigoDesconto(), desconto);
    }



    private double geradorPreco() {
        System.out.printf("[%s] simulando API externa para buscar preço...%n", Thread.currentThread().getName());

        delay();

        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

