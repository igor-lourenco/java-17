package com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas;


public class Desconto {

    public enum Code {
        SEM_DESCONTO(0),
        DESCONTO_5_PORCENTO(5),
        DESCONTO_10_PORCENTO(10),
        DESCONTO_15_PORCENTO(15);

        private final int porcentagemDesconto;

        Code(int porcentagemDesconto) {
            this.porcentagemDesconto = porcentagemDesconto;
        }

        public int getPorcentagemDesconto() {
            return porcentagemDesconto;
        }
    }
}
