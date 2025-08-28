package com.java17._18_optional.ciaaerea;

public class Main {

    public static void main(String[] args) {

        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);

        Voo voo = new Voo("G3133", "Uberlândia", "Guarulhos");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A887", 2);

        System.out.println();
        servicoDeReserva.getReservas().forEach(System.out::println);





    }
}
