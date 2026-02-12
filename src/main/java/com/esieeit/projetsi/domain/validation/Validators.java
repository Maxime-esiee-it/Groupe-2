package com.esieeit.projetsi.domain.validation;

import com.esieeit.projetsi.domain.exception.ValidationException;

public class Validators {

    public static String requireNonBlank(String value, String fieldName, int minLength, int maxLength) {
        if (value == null || value.isBlank())
            throw new ValidationException(fieldName + " ne peut pas être vide");
        if (value.length() < minLength || value.length() > maxLength)
            throw new ValidationException(fieldName + " doit être entre " + minLength + " et " + maxLength + " caractères");
        return value;
    }

    public static <T> T requireNonNull(T value, String fieldName) {
        if (value == null)
            throw new ValidationException(fieldName + " ne peut pas être null");
        return value;
    }

    public static String requireEmail(String email, String fieldName) {
        if (email == null || !email.contains("@"))
            throw new ValidationException(fieldName + " doit être un email valide");
        return email;
    }
}
