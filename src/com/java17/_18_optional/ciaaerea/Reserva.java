package com.java17._18_optional.ciaaerea;

import java.util.Objects;

public class Reserva {

    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int quantBagagens;

    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo, () -> {
            throw new IllegalArgumentException("O código não pode ser nulo");});

        Objects.requireNonNull(voo, () -> {
            throw new IllegalArgumentException("O voo não pode ser nulo");});

        Objects.requireNonNull(nomePassageiro, () -> {
            throw new IllegalArgumentException("O nomePassageiro não pode ser nulo");});

        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);
    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getQuantBagagens() {
        return quantBagagens;
    }

    public void adicionarBagagens(int quantidade){
        this.quantBagagens = this.quantBagagens + quantidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reserva{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", voo=").append(voo.codigo() + "(" + voo.origem() +" - "+ voo.destino()+ ")");
        sb.append(", passageiro=").append(passageiro.getNome());
        sb.append(", quantidadeBagagens=").append(quantBagagens);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Reserva reserva = (Reserva) object;
        return Objects.equals(codigo, reserva.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
