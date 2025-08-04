package com.java17._10_collectionsFramework.map.treeMap.modelo;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private final String placa;
    private final String modelo;

    public Carro(String placa, String modelo) {
        Objects.requireNonNull(placa);
        Objects.requireNonNull(modelo);

        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("placa='").append(placa).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Carro o) {
        return getPlaca().compareTo(o.getPlaca());
    }
}
