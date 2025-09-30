package com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public final class Orcamento {

    private final String nomeLoja;
    private final double preco;
    private final Desconto.Code codigoDesconto;

    private Orcamento(String nomeLoja, double preco, Desconto.Code codigoDesconto) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.codigoDesconto = codigoDesconto;
    }

    /**
     * Cria novo objeto Orcamento a partir do valor seguindo o padrão nomeLoja:preco:codigoDesconto
     *
     * @param valor contendo nomeLoja:preco:codigoDesconto
     * @return novo Orcamento com valores de @param valor
     */
    public static Orcamento novoOrcamento(String valor) {
        try {
            String[] valores = valor.split(":");

            DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR")); // EUA
            NumberFormat numberFormat = new DecimalFormat("#,##0.00");

            return new Orcamento(
                valores[0],
                numberFormat.parse(valores[1]).doubleValue(),
                Desconto.Code.valueOf(valores[2]));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public Desconto.Code getCodigoDesconto() {
        return codigoDesconto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orcamento{");
        sb.append("nomeLoja='").append(nomeLoja).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", codigoDesconto=").append(codigoDesconto);
        sb.append('}');
        return sb.toString();
    }
}
