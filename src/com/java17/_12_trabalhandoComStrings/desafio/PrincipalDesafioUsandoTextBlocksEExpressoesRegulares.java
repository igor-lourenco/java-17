package com.java17._12_trabalhandoComStrings.desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrincipalDesafioUsandoTextBlocksEExpressoesRegulares {

    public static void main(String[] args) {

        String json = """
            {
                "id" : 1,
                "nome" : "Joao da Silva"
            },
            {
                "id" : 2,
                "nome" : "Maria Abadia"
            },
            {
                "id" : 3,
                "nome" : "Sebastiao Carvalho"
            }
            """;

        System.out.println(json);

//      regex para extrair os nomes do json
        String regexNome = "(\"nome\"\\s:\\s\"(?<nomeExtraido>.*)\")";
        Pattern patterNome = Pattern.compile(regexNome);
        Matcher matcherNome = patterNome.matcher(json);

        while (matcherNome.find()){
            System.out.println("Nome extraido: " + matcherNome.group("nomeExtraido"));
        }


//      regex para extrair os ids do json
        String regexId = "(\"id\"\\s:\\s(?<idExtraido>.*),)";
        Pattern patterId = Pattern.compile(regexId);
        Matcher matcherId = patterId.matcher(json);

        while (matcherId.find()){
            System.out.println("Id extraido: " + matcherId.group("idExtraido"));
        }

//      regex para extrair os ids e os nomes do json
//      \s* = para aceitar espaços e/ou quera de linha várias vezes
        String regex = "\"id\"\\s*:\\s*(?<idExtraido>\\d+)\\s*,\\s*\"nome\"\\s*:\\s*\"(?<nomeExtraido>.*)\"";
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(json);

        while (matcher.find()){
            System.out.println("Id: " + matcher.group("idExtraido")
                + ", Nome: " +  matcher.group("nomeExtraido"));
        }

    }
}
