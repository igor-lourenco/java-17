package com.java17._3_encapsulamentoEJavaBeansERecords.agenda;

public record HorarioRecord(int hora, int minuto) {

    public HorarioRecord{

        if(hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora invalida: " + hora);
        }

        if(minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto invalido: " + minuto);
        }
    }

    public String formata(){
        return String.format("%n%dh%dm", hora(), minuto());
    }
}
