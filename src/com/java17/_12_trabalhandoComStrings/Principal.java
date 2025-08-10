package com.java17._12_trabalhandoComStrings;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        String nome1 = "Joao";
        String nome2 = new String("Joao");

        System.out.println();
        System.out.printf("Comparando endereco de memoria: %b%n", nome1 == nome2); // compara o endereço de mémoria das Strings
        System.out.println("Comparando conteudo: " + nome1.equals(nome2)); // compara o conteúdo das Strings


//      TODO: método equalsIgnoreCase
        String nome3 = "Joao";
        String nome4 = new String("JOAO");

        System.out.println();
        System.out.println(">>> equalsIgnoreCase");
        System.out.println("Comparando maiuscula e minuscula: " + nome3.equalsIgnoreCase(nome4));


//      TODO: método isEmpty
        String nome5 = "";

        System.out.println();
        System.out.println(">>> isEmpty");
        System.out.println("Comparando string vazia: " + nome5.isEmpty());

//      TODO: método isBlank
        String nome6 = "         ";

        System.out.println();
        System.out.println(">>> isBlank");
        System.out.println("Comparando string em branco(com espacos): " + nome6.isBlank());


//      TODO: método startsWith
        String nome7 = "Joao";

        System.out.println();
        System.out.println(">>> startsWith");
        System.out.println("Verifica se a string comeca com caractere especifico(J): " + nome7.startsWith("J"));

//      TODO: método endsWith
        String nome8 = "Joao";

        System.out.println();
        System.out.println(">>> endsWith");
        System.out.println("Verifica se a string termina com caractere especifico(o): " + nome8.startsWith("o"));

//      TODO: método contains
        String nome9 = "Joao";

        System.out.println();
        System.out.println(">>> contains");
        System.out.println("Verifica se a string contem caractere especifico(ao): " + nome9.contains("ao"));


//      TODO: métodos indexOf e substring
        String nome10 = "Joao Silva Souza";
        int index = nome10.indexOf(" ") + 1; // 4 + 1

        if(index < 0) throw new RuntimeException("Nao e um nome completo");

        System.out.println();
        System.out.println(">>> indexOf, substring");
        System.out.println("Todo o sobrenome do nome '" + nome10 + "': " + nome10.substring(index));

        int end = nome10.indexOf(" ", index); // 10

        if(end < 0) end = nome10.length(); // Se não tiver o " ", pega o tamanho da string

        System.out.println("Apenas o primeiro sobrenome do nome '" + nome10 + "': " + nome10.substring(index, end));


//      TODO: métodos lastIndexOf e substring
        String nome11 = "Joao Silva Sousa";
        int lastIndex = nome11.lastIndexOf(" ") + 1; // 10 + 1


        System.out.println();
        System.out.println(">>> lastIndexOf, substring");
        System.out.println("Apenas o ultimo sobrenome do nome '" + nome11 + "': " + nome11.substring(lastIndex));


//      TODO: método toUpperCase
        String nome12 = "Joao Silva Sousa";

        System.out.println();
        System.out.println(">>> toUpperCase");
        System.out.println("Nome em maiusculo '" + nome12 + "': " + nome12.toUpperCase());


//      TODO: método toLowerCase
        String nome13 = "Joao Silva Sousa";

        System.out.println();
        System.out.println(">>> toLowerCase");
        System.out.println("Nome em maiusculo '" + nome13 + "': " + nome13.toLowerCase());


//      TODO: método strip
        String nome14 = "\n     Joao Silva Sousa     ";

        System.out.println();
        System.out.println(">>> strip");
        System.out.println("Nome com todos os espacos em branco iniciais e finais removidos. '>" + nome14 + "<': "
            + "[" + nome14.strip() + "]");


//      TODO: método stripLeading
        String nome15 = "\n     Joao Silva Sousa     ";

        System.out.println();
        System.out.println(">>> stripLeading");
        System.out.println("Nome com todos os espacos em branco iniciais removidos. '>" + nome15 + "<': "
            + "["+ nome15.stripLeading() + "]");


//      TODO: método stripTrailing
        String nome16 = "\n     Joao Silva Sousa     ";

        System.out.println();
        System.out.println(">>> stripTrailing");
        System.out.println("Nome com todos os espacos em branco finais removidos. '>" + nome16 + "<': "
            + "["+ nome16.stripTrailing() + "]");


//      TODO: método replace
        String nome17 = "Joao Silva Sousa Costa de Oliveira Machado dos Santos";

        System.out.println();
        System.out.println(">>> replace");
        System.out.println("Substituindo a letra 'a' por '* do nome'. '" + nome17 + "': "
            + "[" +nome17.replace("a", "*") + "]");


//      TODO: métodos toUpperCase, strip e replace para formatar o nome
        String nome18 = "\n    Joao da Silva de Sousa Costa de Oliveira Machado dos Santos    \n";

        System.out.println();
        System.out.println(">>> formatando nome");
        System.out.println("Formatando nome'. '[" + nome18 + "]': "
            + "[" + formatarNome(nome18, "da", "de", "dos") + "]");


//      TODO: método repeat para preencher a esquerda o codigo
        int codigo = 123;

        System.out.println();
        System.out.println(">>> formatando codigo");
        System.out.println("Formatando codigo preenchendo a esquerda'. '[" + codigo + "]': "
            + "[" + preencherAEsquerda(String.valueOf(codigo), '0', 10) + "]");


//      TODO: método split com expressões regulares (regex)
        String email = "joao@gmail.com";

        String regex = "[@.]"; // para recortar usando os separadores '@' e o '.'
        String[] partesDoEmail = email.split(regex);

        System.out.println();
        System.out.println(">>> Usando split com expressoes regulares (regex) para recortar usando os separadores '@' e o '.'");
        System.out.println("Recortando o email'. '[" + email + "]': " + Arrays.toString(partesDoEmail));





    }


    private static String formatarNome(String nome18, String... preposicoesParaExclusao) {
        String nomeFormatado = nome18.toUpperCase().strip();

        for (String preposicao : preposicoesParaExclusao) {
            nomeFormatado = nomeFormatado
                .replace(" " + preposicao.toUpperCase() + " ", " ");
        }

        return nomeFormatado;
    }

    private static String preencherAEsquerda(String texto, char character, int tamanhoTotal) {
        if(texto.length() > tamanhoTotal) return texto;

        return String.valueOf(character)
            .repeat(tamanhoTotal - texto.length())
            .concat(texto);
    }
}
