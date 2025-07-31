package com.java17._10_collectionsFramework.list.desafio;

import java.util.*;

public class CadastroPacoteViagem {

    private List<PacoteViagem> pacoteViagens = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria){
        var novoPacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if(this.pacoteViagens.contains(novoPacoteViagem)){
            throw new IllegalArgumentException("Pacote de Viagem ja foi inserido");
        }
        this.pacoteViagens.add(novoPacoteViagem);
    }

    public List<PacoteViagem> obterTodos(){
        return this.pacoteViagens;
    }

    public void ordenar(){
        Collections.sort(pacoteViagens);
    }

    public void ordenarPorPrecoDecrescente(){
        Collections.sort(this.pacoteViagens, new PrecoComparator().reversed());

    }

    public void removerPorDescricao(String descricao){
        Iterator<PacoteViagem> iterator = this.pacoteViagens.iterator();
        List<PacoteViagem> pacoteViagensEncontrado = new ArrayList<>();

        while (iterator.hasNext()){
            PacoteViagem pacoteViagem = iterator.next();

            if(pacoteViagem.getDescricao().equals(descricao)){
                System.out.println("DEBUG: Pacote de viagem encontrado: " + descricao);
                pacoteViagensEncontrado.add(pacoteViagem);
            }
        }

        if(!this.pacoteViagens.removeAll(pacoteViagensEncontrado)) System.out.println("Nenhum Pacote de Viagem removido");
    }

    public PacoteViagem buscarPorDescricao(String descricao){
        PacoteViagem pacoteViagemEncontrado = null;

        for (PacoteViagem pacoteViagem : this.pacoteViagens) {
            if(pacoteViagem.getDescricao().equals(descricao)){
                 pacoteViagemEncontrado = pacoteViagem;
            }
        }

        return Objects.requireNonNull(pacoteViagemEncontrado, "Pacote de Viagem nao encontrado");
    }
}
