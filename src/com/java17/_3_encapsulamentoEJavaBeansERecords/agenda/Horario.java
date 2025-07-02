package com.java17._3_encapsulamentoEJavaBeansERecords.agenda;

public class Horario {

    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {

        setHora(hora);
        setMinuto(minuto);
    }

    public String formata(){
        return String.format("%n%dh%dm", getHora(), getMinuto());
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {

        if(hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        this.hora = hora;
    }

    public void setMinuto(int minuto) {

        if(minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.minuto = minuto;
    }
}
