package com.java17._12_trabalhandoComStrings.webScraper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) {

        String html = "<a href=\"mailto:joao@gmail.com\">\n    joao@gmail.com</a>\n" +
            "<a>\n    abc@google.com</a>\n<a>xyz@google.com\n</a>\n" +
            "<strong>maria@gmail.com</strong>\n" +
            "<strong>jose@gmail.com</strong>\n" +
            "<strong>jose@Gmail.com</strong>" + // email invalido
            "<strong>rose@gmail.com</strong>";

        System.out.println();
        System.out.println(html);
        System.out.println("-------------");

//      () = grupo de captura
//      .  = qualquer caracter e * = muitas vezes
//      captura qualquer coisa muitas vezes que está entre a tag <strong></strong>
//      String regex = "<strong>(.*)</strong>";

//      captura apenas email válidos que está entre a tag <strong></strong>
//      String regex = "<strong>([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})</strong>";

//      ? = uma vez ou nunca, obs: para parar na primeira '>' e não no último '>' da string
//      captura qualquer coisa que está entre a tag'< >' e '</ >', mas apenas que sejam emails válidos
//      String regex = "<.*?>([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})</.*?>";

//      \s = Um caractere de espaço em branco e/ou quebra de linha, para indicar que pode ter entre a tag'< >' e '</ >'
//      captura qualquer coisa que está entre a tag'< >' e '</ >',
//      pode ter espaço em branco e/ou quebra de linha entre a tag
//      mas apenas que sejam emails válidos
        String regex = "<.*?>\\s*([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        System.out.println();
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

        System.out.println("-----------------------");

//      ?<> = dentro do () serve para nomear esse grupo
        String regexNomeandoGrupo = "<.*?>\\s*(?<email>[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";
        Pattern patternNomeandoGrupo = Pattern.compile(regexNomeandoGrupo);
        Matcher matcherNomeandoGrupo = patternNomeandoGrupo.matcher(html);

        System.out.println();
        while (matcherNomeandoGrupo.find()){
            System.out.println(matcherNomeandoGrupo.group("email"));
        }
    }
}
