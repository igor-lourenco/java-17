package com.java17._10_collectionsFramework.list.desafio;

public class PacoteViagem extends Pacote{

    private int dias;

    public PacoteViagem() {
    }

    public PacoteViagem(String descricao, Double precoPorPessoa) {
        super(descricao, precoPorPessoa);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append('{');
        sb.append("descricao='").append(getDescricao()).append('\'');
        sb.append(", precoPorPessoa=").append(getPrecoPorPessoa());
        sb.append(", dias=").append(getDias());
        sb.append('}');
        return sb.toString();
    }
}
