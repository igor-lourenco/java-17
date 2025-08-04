package com.java17._10_collectionsFramework.map.desafio;

import com.java17._10_collectionsFramework.map.desafio.modelo.Cidade;
import com.java17._10_collectionsFramework.map.desafio.modelo.Estado;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {

        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceara");
        Estado ro = new Estado("RO", "Rondonia");
        Estado sp = new Estado("SP", "Sao Paulo");

        Cidade saoPaulo = new Cidade(3550308, "Sao paulo", 40_000_000);
        Cidade beloHorizonte = new Cidade(3550308, "Belo Hprizonte", 30_000_000);
        Cidade fortaleza = new Cidade(3550308, "Fortaleza", 20_000_000);
        Cidade portoVelho = new Cidade(3550308, "Porto Velho", 10_000_000);


//      TODO: Performance é mais importante (não garante a ordem das chaves)
//        Map<Estado, Cidade> capitais = new HashMap<>();

//      TODO: Performance é importante, mas precisa manter a ordem de inserção das chaves
//        Map<Estado, Cidade> capitais = new LinkedHashMap<>();

//      TODO: Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);


//      TODO: Iteração nas entradas do mapa (chave/valor)
        imprimirCapitais(capitais);
    }

    private static void imprimirCapitais(Map<Estado, Cidade> capitais) {
        Set<Map.Entry<Estado, Cidade>> entries = capitais.entrySet();

        for (Map.Entry<Estado, Cidade> entry : entries) {
            System.out.printf("Capital: %s, Estado: %s tem %d habitantes%n",
                entry.getValue().getNome(), entry.getKey().getNome(), entry.getValue().getTotalHabitantes());
        }
    }
}
