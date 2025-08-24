package com.java17._16_classesAninhadas.classesAninhadasEstaticas.depois;

public class ServicoEmail {

    public void enviar(Mensagem msg) {

        System.out.printf("\nEnviando de %s para %s: %s%n",
            msg.remetente, // podem acessar atributos privados da classe aninhada e vice-verso
            msg.destinatario,
            msg.texto);

    }


//  Método estático da classe superior também pode ser usado pela classe aninhada
    private static String gerarAssinatura() {
        return "\n--\nGoogle";
    }


    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            return texto + gerarAssinatura();
        }
    }

}
