package com.java17._12_trabalhandoComStrings.desafio;

public class ValidadorEmail {

    public static boolean validar(String email) {

        if (estaVazio(email)) return false;

        if(!contem(email, "@")) return false;

        for (char c : email.toCharArray()) {
            if(Character.isWhitespace(c)){
                return false;
            }
        }

        String[] split = email.split("@");

        if(split.length != 2) return false;

//      Primeira parte do email
        if (estaVazio(split[0])) return false;

        if(contem(split[0], ".com", "#")) return false;


//      Segunda parte do email
        if (estaVazio(split[1])) return false;

        if(!(split[1].endsWith(".com") || split[1].endsWith(".me"))) return false;

        if(contem(split[1], "#")) return false;

        if(split[1].startsWith(".com")) return false;


        for (char c : split[1].toCharArray()) {
            if(Character.isUpperCase(c)) return false;
        }

        return true;
    }

    private static boolean contem(String text, String... values) {
        for (String value : values) {
            if (text.contains(value)) return true;

        }
        return false;
    }


    private static boolean estaVazio(String email) {
        if(null == email || email.isBlank()){
            return true;
        }
        return false;
    }

}
