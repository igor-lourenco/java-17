package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioLocalTimeLocalDateELocalDateTime.exceptions;

import java.time.format.DateTimeParseException;

public class HorarioInvalidoException extends DateTimeParseException {

    public HorarioInvalidoException(String message, String parsedData, int errorIndex) {
        super(message, parsedData, errorIndex);
    }
}
