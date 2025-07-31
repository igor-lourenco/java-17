package com.java17._10_collectionsFramework.list.vector.agencia;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> {

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome);
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if(precoDiaria < 0) throw new IllegalArgumentException("Preco da diaria nao pode ser menor negativo");

        this.precoDiaria = precoDiaria;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hotel hotel = (Hotel) object;
        return Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cidade='").append(cidade).append('\'');
        sb.append(", precoDiaria=").append(precoDiaria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Hotel hotel) {
//      Comparando usando String em vez de double
        return getNome().compareTo(hotel.getNome());


//        Melhorando mais ainda a implementação
//        return Double.compare(getPrecoDiaria(), hotel.getPrecoDiaria());

//        Melhorando implementação
//        return Double.valueOf(getPrecoDiaria()).compareTo(hotel.getPrecoDiaria());


//        Implementação
//        if(this.getPrecoDiaria() < hotel.getPrecoDiaria()){
//            return -1;
//        } else if(this.getPrecoDiaria() > hotel.getPrecoDiaria()){
//            return 1;
//        }
//
//        return 0;
    }
}
