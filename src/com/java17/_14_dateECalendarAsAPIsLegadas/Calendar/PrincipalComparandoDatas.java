package com.java17._14_dateECalendarAsAPIsLegadas.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrincipalComparandoDatas {

    public static void main(String[] args) {

        Calendar dataNascimentoMaria = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13);

        Calendar dataNascimentoJoao = new GregorianCalendar(1981, Calendar.SEPTEMBER, 20);

        if(dataNascimentoJoao.after(dataNascimentoMaria)){
            System.out.println("Joao eh mais velho: " + dataNascimentoJoao.getTime());
        }

        if(dataNascimentoJoao.before(dataNascimentoMaria)){
            System.out.println("Joao eh mais novo: " + dataNascimentoJoao.getTime());
        }


        System.out.println("\nUsando o compareTo:");


        dataNascimentoMaria.set(Calendar.DAY_OF_MONTH, 20);

        int i = dataNascimentoJoao.compareTo(dataNascimentoMaria);

        if(i > 0){
            System.out.println("Joao eh mais velho que a Maria");
        }else if(i < 0){
            System.out.println("Joao eh mais novo que a Maria");
        }else {
            System.out.println("Joao tem a mesma idade que a Maria");
        }

    }
}
