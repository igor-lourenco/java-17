package com.java17._10_collectionsFramework.list.desafio;

import java.util.*;

public class CadastroPacoteViagem<T extends Pacote> {

    private List<T> pacotesList = new ArrayList<>();

    public void adicionar(T obj) throws Exception {

        for (T pacoteViagem : this.pacotesList) {
            if (pacoteViagem.getDescricao().equals(obj.getDescricao())
                && Double.valueOf(pacoteViagem.getPrecoPorPessoa()).equals(obj.getPrecoPorPessoa())) {
                throw new IllegalArgumentException("Pacote de Viagem ja foi inserido");

            }
        }

        this.pacotesList.add(obj);
    }

    public List<T> obterTodos() {
        return this.pacotesList;
    }

    public void ordenar() {
        Collections.sort(pacotesList);
    }

    public void ordenarPorPrecoDecrescente() {
        Collections.sort(this.pacotesList, new PrecoComparator<T>().reversed());

    }

    public void removerPorDescricao(String descricao) {
        Iterator<T> iterator = this.pacotesList.iterator();
        List<T> pacoteViagensEncontrado = new ArrayList<>();

        while (iterator.hasNext()) {
            T pacoteViagem = iterator.next();

            if (pacoteViagem.getDescricao().equals(descricao)) {
                System.out.println("DEBUG: Pacote de viagem encontrado: " + descricao);
                pacoteViagensEncontrado.add(pacoteViagem);
            }
        }

        if (!this.pacotesList.removeAll(pacoteViagensEncontrado))
            System.out.println("Nenhum Pacote de Viagem removido");
    }

    public T buscarPorDescricao(String descricao) {
        T pacoteViagemEncontrado = null;

        for (T pacoteViagem : this.pacotesList) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemEncontrado = pacoteViagem;
            }
        }

        return Objects.requireNonNull(pacoteViagemEncontrado, "Pacote de Viagem nao encontrado");
    }
}
