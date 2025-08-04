package com.java17._10_collectionsFramework.map.treeMap;

import com.java17._10_collectionsFramework.map.treeMap.modelo.Carro;
import com.java17._10_collectionsFramework.map.treeMap.modelo.Proprietario;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porshe = new Carro("EJA0V44", "Porshe 911");

        Proprietario maria = new Proprietario("Maria", "11111111111");
        Proprietario ana = new Proprietario("Ana", "11111111111");
        Proprietario jose = new Proprietario("Jose", "11111111111");
        Proprietario joao = new Proprietario("Joao", "11111111111");

        // Mantém a ordem natural dos elementos conforme a implementação do Comparable na classe Carro e é mais lento que o HashMap
        Map<Carro, Proprietario> proprietarios = new TreeMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porshe, maria);


//        System.out.println(proprietarios);
//        System.out.printf("\nO proprietario do carro %s = %s",ford, proprietarios.get(ford));

        System.out.println("Carros:");
        Set<Carro> carros1 = proprietarios.keySet(); // lista de chaves
        for (Carro carro : carros1) {
            System.out.println(carro);
        }


        System.out.println();
        System.out.println("Proprietarios: ");
        Collection<Proprietario> values = proprietarios.values(); // lista dos valores
        for (Proprietario proprietario : values) {
            System.out.println(proprietario);
        }


        System.out.println();
        System.out.println("Percorrendo o Map:");
        Set<Carro> carros2 = proprietarios.keySet();
        for (Carro carro : carros2) {
            Proprietario prop = proprietarios.get(carro);
            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), prop.getNome());
        }


        System.out.println();
        System.out.println("Percorrendo o Map da melhor forma:");
        Set<Map.Entry<Carro, Proprietario>> entries = proprietarios.entrySet();
        for (Map.Entry<Carro, Proprietario> entry : entries) {
            System.out.printf("%s (%s) = %s%n",
                entry.getKey().getPlaca(), entry.getKey().getModelo(), entry.getValue().getNome());
        }


        proprietarios.put(porshe, jose);
        System.out.println();
        System.out.println("Alterando o valor relacionado a chave: " + porshe.getModelo());
        for (Map.Entry<Carro, Proprietario> entry : entries) {
            System.out.printf("%s (%s) = %s%n",
                entry.getKey().getPlaca(), entry.getKey().getModelo(), entry.getValue().getNome());
        }


        proprietarios.remove(porshe);
        System.out.println();
        System.out.println("Removendo pela chave: " + porshe.getModelo());
        for (Map.Entry<Carro, Proprietario> entry : entries) {
            System.out.printf("%s (%s) = %s%n",
                entry.getKey().getPlaca(), entry.getKey().getModelo(), entry.getValue().getNome());
        }
    }
}
