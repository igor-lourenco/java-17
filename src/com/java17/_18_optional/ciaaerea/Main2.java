package com.java17._18_optional.ciaaerea;

import java.util.function.Consumer;

public class Main2 {

    public static void main(String[] args) {

        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);

        Voo voo = new Voo("G3133", "Uberlândia", "Guarulhos");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));


        Consumer<Reserva> consumer = reserva -> reserva.adicionarBagagens(10);

        servicoDeReserva.buscar("28A888")
            .ifPresent(consumer); // se não tiver presente, não faz nada

        System.out.println();
        servicoDeReserva.getReservas().forEach(System.out::println);


        servicoDeReserva.buscar("28A887")
            .ifPresentOrElse(
                reserva -> reserva.adicionarBagagens(10),
                () -> System.out.println("\nReserva 28A887 não encontrada"));

    }
}
