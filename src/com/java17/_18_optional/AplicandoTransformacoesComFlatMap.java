package com.java17._18_optional;

import com.java17._18_optional.ciaaerea.*;
import com.java17._18_optional.ciaaerea.exceptions.PassageiroNaoEncontradoException;

public class AplicandoTransformacoesComFlatMap {

    public static void main(String[] args) {

        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);

        Voo voo = new Voo("G3133", "Uberlândia", "Guarulhos");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 10);

        System.out.println("\nReservas:");
        servicoDeReserva.getReservas().forEach(System.out::println);

        Passageiro passageiro = servicoDeReserva.buscar("28A888")
            .filter(reserva -> reserva.getQuantBagagens() > 0)
            .flatMap(Reserva::getPassageiroOptional)
            .orElseThrow(() ->
                new PassageiroNaoEncontradoException("Passageiro não encontrado ou quantidade de bagagens zerado"));

        System.out.println("\nBuscando passageiro com quantidade de bagagem maior que 0");
        System.out.println("Passageiro: " + passageiro);


    }
}
