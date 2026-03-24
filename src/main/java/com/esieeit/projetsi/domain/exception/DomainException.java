package com.esieeit.projetsi.domain.exception;

/**
 * Exception racine du domaine métier.
 */
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
