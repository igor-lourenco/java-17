package com.java17._16_classesAninhadas.classesAninhadasEstaticas.antes;

public class ServicoEmail {

    public void enviar(Mensagem msg){

        System.out.printf("\nEnviando de %s para %s: %s%n",
            msg.getRemetente(), msg.getDestinatario(), msg.getTexto());
    }
}
