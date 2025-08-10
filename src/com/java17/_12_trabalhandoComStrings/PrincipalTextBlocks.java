package com.java17._12_trabalhandoComStrings;

public class PrincipalTextBlocks {

    public static void main(String[] args) {

        String string = "<a href=\"mailto:joao@gmail.com\">\n    joao@gmail.com</a>\n" +
            "<a>\n    abc@google.com</a>\n<a>xyz@google.com\n</a>\n" +
            "<strong>maria@gmail.com</strong>\n" +
            "<strong>jose@gmail.com</strong>\n" +
            "<strong>jose@Gmail.com</strong>" +
            "<strong>rose@gmail.com</strong>";

        String adcionaEmailNaStringComTextBlock = "novoemailadicionado@gmail.com";

        String stringComTextBlock = """ 
            <a href="mailto:joao@gmail.com">
                joao@gmail.com
            </a>
            <a>
                abc@google.com
            </a>
            <a>
                xyz@google.com
            </a>
            <strong>
                maria@gmail.com
            </strong>
            <strong>
                jose@gmail.com
            </strong>
            <strong>
                jose@Gmail.com
            </strong>
            <strong>
                rose@gmail.com
            </strong>            
            <strong>
                email adicionado - %s -
            </strong>
            """.formatted(adcionaEmailNaStringComTextBlock);

        System.out.println(stringComTextBlock);
    }
}
