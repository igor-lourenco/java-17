package com.java17._11_enumeracoes.desafio;

public class Principal {

    public static void main(String[] args) {

        NotaFiscal notaFiscal = new NotaFiscal(123, "Macbook Pro", 18_000);
        System.out.println();

        System.out.println(notaFiscal.getDescricaoCompleta());

        notaFiscal.emitir();
        System.out.println(notaFiscal.getDescricaoCompleta());

        notaFiscal.cancelar(); // IllegalArgumentException
        System.out.println(notaFiscal.getDescricaoCompleta());
    }
}
