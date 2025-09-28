package com.java17._25_concorrencia._10_Executor_Future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CotacaoDolar implements Callable<Double> {
    @Override
    public Double call() throws Exception {
        String thread = Thread.currentThread().getName();
        System.out.printf("[%s] - Aguardando 5 seg, simulando chamada no servidor externo...%n", thread);
        TimeUnit.SECONDS.sleep(5);
        return 4.5d;
    }
}
