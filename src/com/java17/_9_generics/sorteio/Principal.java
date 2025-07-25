package com.java17._9_generics.sorteio;

import com.java17._9_generics.sorteio.modelo.Cliente;
import com.java17._9_generics.sorteio.modelo.Sorteador;

public class Principal {

    public static void main(String[] args) {

        Cliente[] clientes = {
            new Cliente("Supermercado", 100_000),
            new Cliente("Posto Gasolina", 800_000),
            new Cliente("Empresa", 800_000),
            new Cliente("Consultoria", 58_000)
        };

//        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.printf("\nCliente sorteado: " + clienteSorteado.getRazaoSocial());

        String[] nomes = {
          "Jose", "Maria", "Joao", "Marcos"
        };

//        String nomeSorteado = Sorteador.<String>sortear(nomes);
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println("\nNome sorteado: " + nomeSorteado);
    }
}
