package com.esieeit.projetsi.domain.validation;

import com.esieeit.projetsi.domain.exception.ValidationException;

public class Validators {

    public static <T> T requireNonNull(T value, String fieldName) {
        if (value == null) throw new ValidationException(fieldName + " ne doit pas être null");
        return value;
    }

    public static String requireNonBlank(String value, String fieldName, int min, int max) {
        if (value == null) throw new ValidationException(fieldName + " ne doit pas être null");
        String v = value.trim();
        if (v.isEmpty()) throw new ValidationException(fieldName + " ne doit pas être vide");
        if (v.length() < min || v.length() > max)
            throw new ValidationException(fieldName + " doit être entre " + min + " et " + max + " caractères");
        return v;
    }

    public static String requireEmail(String value, String fieldName) {
        if (value == null || !value.matches(".+@.+\\..+"))
            throw new ValidationException(fieldName + " doit être un email valide");
        return value;
    }

    public static int requirePositive(int value, String fieldName) {
        if (value <= 0) throw new ValidationException(fieldName + " doit être > 0");
        return value;
    }
}
